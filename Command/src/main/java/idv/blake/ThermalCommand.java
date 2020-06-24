package idv.blake;

public class ThermalCommand implements Command{

    private Thermal thermal = null;

    public ThermalCommand(String ipAddress){
        thermal = new Thermal(ipAddress);
    }

    @Override
    public Result execute() {
        Result result = new Result();
        if (thermal.isOverheat()){
            result.setStatus(Result.CRITICAL);
            result.setMessage("溫度過熱 :" + toString());
        }
        return result;
    }
}
