package idv.blake;

public class SpamMailHandler extends MailHandler{

    public SpamMailHandler(MailHandler handler) {
        super(handler);
    }

    @Override
    public String handleMail(Mail mail) {
        if(mail.getSubject().contains("Spam")) {
            return "Spam Mail";
        }
        else{
            return toNext(mail);
        }
    }
}
