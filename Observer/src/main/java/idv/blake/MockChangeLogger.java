package idv.blake;

public class MockChangeLogger implements Observer {
    public int notifiedCount = 0;


    @Override
    public void update(Subject subject) {
        notifiedCount++;
    }
}
