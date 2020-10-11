import com.plivo.controller.*;
import com.plivo.model.account.response.AccountDetailsResponse;
import com.plivo.model.details.response.DetailsResponse;
import com.plivo.model.message.response.MessageResponse;
import com.plivo.model.pricing.response.PricingResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import java.util.List;

public class TestAPIClass {
    Logger logger = Logger.getLogger(TestAPIClass.class);
    private AccountDetailsController accountDetails;
    private MessageController message;
    private MessageDetailsController messageDetails;
    private NumberController number;
    private PricingController pricing;

    String msgUUID;
    String countryCode = "US";
    double cashCreditBeforeTest;

    @BeforeClass
    public void beforeClass() throws Exception {
        logger.info("Creating instances for controller classes.");
        this.accountDetails = new AccountDetailsController();
        this.message = new MessageController();
        this.messageDetails = new MessageDetailsController();
        this.number = new NumberController();
        this.pricing = new PricingController();

        logger.info("Get the cash credits before sending the test message.");
        AccountDetailsResponse adResponse = accountDetails.getAccountDetails();
        cashCreditBeforeTest = Double.parseDouble(accountDetails.getAccountCashCredits(adResponse));
        logger.info("Cash credit from Account details API before starting test is %d" + cashCreditBeforeTest);
    }

    @Test
    public void sendTestMessage() throws Exception {
        List<String> phNumbers = number.getNNumbers(2);
        String testTextMessage = "This is a test text message";
        logger.info("Sending message and getting the message UUID.");
        MessageResponse msgResponse = message.sendMessage(phNumbers.get(0), phNumbers.get(1), testTextMessage);
        logger.info(msgResponse.toString());
        msgUUID = message.getMessageUUID(msgResponse);
        logger.info("Message UUID of the sent message is " + msgUUID);
        Assert.assertTrue(!msgUUID.isEmpty(), "msgUUID is empty.");
    }

    @Test(dependsOnMethods = "sendTestMessage")
    public void getMessageDetails() throws Exception {
        DetailsResponse response = messageDetails.getMessageDetails(msgUUID);
        logger.info("Detailed message response for message UUID " + msgUUID + " is ");
        logger.info(response.toString());
        Assert.assertTrue(response.getMessageUuid().equals(msgUUID), "MessageUUID from details API response is not matching with UUID passed as " +
                "param.");
    }

    @Test(dependsOnMethods = "sendTestMessage")
    public void testDeductedRate() throws Exception {
        DetailsResponse detailsResponse = messageDetails.getMessageDetails(msgUUID);
        double deductedAmountInDetails = Double.parseDouble(detailsResponse.getTotalAmount());
        logger.info("Deducted amount from details API is %d" + deductedAmountInDetails);

        PricingResponse pricingResponse = pricing.getPricingResponse(countryCode);
        double deductedAmountInPricing = Double.parseDouble(pricing.getOutboundRate(pricingResponse));
        logger.info("Deducted amount from pricing API is %d" + deductedAmountInPricing);

        Assert.assertEquals(deductedAmountInDetails, deductedAmountInPricing);
    }

    @Test()
    public void testAccountDetails() throws Exception {
        PricingResponse pricingResponse = pricing.getPricingResponse(countryCode);
        double deductedAmountInPricing = Double.parseDouble(pricing.getOutboundRate(pricingResponse));
        logger.info("Deducted amount from pricing API is %d" + deductedAmountInPricing);

        AccountDetailsResponse adResponse = accountDetails.getAccountDetails();
        double cashCreditAfterTest = Double.parseDouble(accountDetails.getAccountCashCredits(adResponse));
        logger.info("Cash credit from Account details API is %d" + cashCreditAfterTest);

        logger.info("Assertion on cash credits before and after sending message");
        Assert.assertEquals((cashCreditBeforeTest - cashCreditAfterTest), deductedAmountInPricing);
    }
}
