package idv.blake;

import java.util.Date;

public class WritingLogObserver implements Observer {
    @Override
    public void update(Subject subject) {
        Client client = (Client) subject;
        if (Status.OK != client.getResult().getStatus()) {
            System.out.println("寫資料到資料庫: " + client.getResult().getMessage() + "在" + new Date().toString());
        }
    }
}
