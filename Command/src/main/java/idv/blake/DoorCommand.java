package idv.blake;

public class DoorCommand implements Command {
    private Door _door = null;

    public DoorCommand(String ipAddress){
        _door = new Door(ipAddress);
    }

    public DoorCommand(Door door){
        _door = door;
    }

    @Override
    public Result execute() {
        Result result = new Result();
        if ("open".equals(_door.getDoorStatus())) {
            result.setStatus(Result.CRITICAL);
            result.setMessage("門被開啟" + toString());
        }
        return result;
    }
}
