package idv.blake;

public class SentingAlertObserver implements Observer {
    @Override
    public void update(Subject subject) {
        Client client = (Client) subject;
        if (Status.OK != client.getResult().getStatus()) {
            System.out.println("發現問題並通知保全人員: " + client.getResult().getMessage());
        }
    }
}
