package idv.blake;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClientTest {

    @Test
    public void subject_status_change_will_notify_observers() {
        Client client = new Client(new DoorCommand(null));
        MockChangeLogger logger1 = new MockChangeLogger();
        MockChangeLogger logger2 = new MockChangeLogger();
        MockChangeLogger logger3 = new MockChangeLogger();

        client.addObserver(logger1);
        client.addObserver(logger2);
        client.addObserver(logger3);

        client.setResult(new Result(Status.CRITICAL));

        Assert.assertEquals(1, logger1.notifiedCount);
        Assert.assertEquals(1, logger2.notifiedCount);
        Assert.assertEquals(1, logger3.notifiedCount);

        client.setResult(new Result(Status.WARRING));

        Assert.assertEquals(2, logger1.notifiedCount);
        Assert.assertEquals(2, logger2.notifiedCount);
        Assert.assertEquals(2, logger3.notifiedCount);
    }

    @Test
    public void integration_test_door_open_will_notify_real_observers() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);

        Server server = new Server();
        Door door = new MockRemoteDoor("192.168.0.1", "open");
        Client client = new Client(new DoorCommand(door));
        SentingAlertObserver alert = new SentingAlertObserver();
        WritingLogObserver log = new WritingLogObserver();
        client.addObserver(alert);

        client.addObserver(log);
        server.addClient(client);

        server.monitor();
        String expected = "發現問題並通知保全人員: 門被開啟\n"+ "寫資料到資料庫: 門被開啟";
        Assert.assertTrue(stream.toString().startsWith(expected));
    }

    @Test
    public void integration_test_door_not_open_will_not_notify_observers() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        System.setOut(printStream);
        Server server = new Server();
        Door door = new MockRemoteDoor("192.168.0.1", "not open");
        Client client = new Client(new DoorCommand(door));
        SentingAlertObserver alert = new SentingAlertObserver();
        WritingLogObserver log = new WritingLogObserver();
        client.addObserver(alert);
        client.addObserver(log);
        server.addClient(client);
        server.monitor();
        Assert.assertEquals("",stream.toString());
    }

}

