package idv.blake;

public abstract class MailHandler {

    protected MailHandler mHandler;
    public MailHandler(MailHandler handler){
        mHandler = handler;
    }

    public String toNext(Mail mail) {
        if(mHandler != null) {
            return mHandler.handleMail(mail);
        }
        else{
            return "Done";
        }
    }

    public abstract String handleMail(Mail mail);
}
