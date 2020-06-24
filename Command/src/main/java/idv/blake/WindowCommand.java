package idv.blake;

public class WindowCommand implements Command{

    private Window window = null;

    public WindowCommand(String ipAddrdss) {
        window = new Window(ipAddrdss);
    }

    @Override
    public Result execute() {

        Result result = new Result();
        String msg = null;

        if (window.isBroken()){
            result.setStatus(Result.CRITICAL);
            msg = "窗戶被打破 ";
        }
        if (window.isOpen()){
            result.setStatus(Result.CRITICAL);
            msg = "窗戶被開啟 " + toString();
        }

        if (null != msg){
            result.setMessage(msg + " :" + toString());
        }
        return result;
    }
}
