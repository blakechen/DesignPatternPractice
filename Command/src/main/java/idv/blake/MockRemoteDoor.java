package idv.blake;

public class MockRemoteDoor extends Door {

    private String status = null;

    public MockRemoteDoor(String ipAddress) {
        super(ipAddress);
    }

    public MockRemoteDoor(String ipAddress, String status) {
        super(ipAddress);
        this.status = status;
    }

    @Override
    public String getDoorStatus(){
        return status;
    }
}
