package idv.blake;

public class ComplainMailHandler extends MailHandler {

    public ComplainMailHandler(MailHandler handler) {
        super(handler);
    }

    @Override
    public String handleMail(Mail mail) {
        if(mail.getSubject().contains("Complain")) {
            return "Complain Mail";
        }
        else{
            return toNext(mail);
        }
    }
}
