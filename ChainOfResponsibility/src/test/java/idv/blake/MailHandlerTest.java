package idv.blake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MailHandlerTest {

    @Test
    public void test_handler() {

        MailHandler handler = new ThankMailHandler(
                new ComplainMailHandler(
                        new SpamMailHandler(
                                new GeneralMailHandler(null))));
        Mail spamMail=new Mail("Spam");
        Mail thxMail=new Mail("Thanks Ur Subject");
        Mail complainpMail=new Mail("Complain xxxx");
        Mail generalMail=new Mail("General xxxx");
        Mail doneMail=new Mail("Done mail");

        assertEquals("Spam Mail", handler.handleMail(spamMail));
        assertEquals("Thanks Mail", handler.handleMail(thxMail));
        assertEquals("Complain Mail", handler.handleMail(complainpMail));
        assertEquals("General Mail", handler.handleMail(generalMail));
        assertEquals("Done", handler.handleMail(doneMail));
    }
}
