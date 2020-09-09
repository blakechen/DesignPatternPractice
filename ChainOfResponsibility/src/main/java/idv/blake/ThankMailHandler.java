package idv.blake;

public class ThankMailHandler extends MailHandler{

    public ThankMailHandler(MailHandler handler) {
        super(handler);
    }

    @Override
    public String handleMail(Mail mail) {
        if(mail.getSubject().contains("Thanks")) {
            return "Thanks Mail";
        }
        else{
            return toNext(mail);
        }
    }
}
