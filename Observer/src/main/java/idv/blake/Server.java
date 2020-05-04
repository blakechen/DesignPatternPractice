package idv.blake;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Server {
    private List<Client> clients = new ArrayList<>();

    public void monitor() {
        for (Client client : clients) {
            client.setResult(client.getCheckCommand().execute());
        }
    }

    public void addClient(Client client) {
    }
}
