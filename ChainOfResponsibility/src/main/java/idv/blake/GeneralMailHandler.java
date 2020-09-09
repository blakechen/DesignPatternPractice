package idv.blake;

public class GeneralMailHandler extends MailHandler{

    public GeneralMailHandler(MailHandler handler) {
        super(handler);
    }

    @Override
    public String handleMail(Mail mail) {
        if(mail.getSubject().contains("General")) {
            return "General Mail";
        }
        else{
            return toNext(mail);
        }
    }
}
