package idv.blake;

import java.util.ArrayList;
import java.util.List;

public class Server {
    List<Command> commands = new ArrayList<>();

    public void monitor() {
        for (Command command : commands) {
            Result result = command.execute();
            if (Result.OK != result.getStatus()) {
                sendAlert(result.getMessage());

            }
        }
    }

    public void sendAlert(String msg) {
        System.out.println("Server 發現問題: " + msg);
    }

    public void addCommand(Command cmd){
        commands.add(cmd);
    }
    public void removeCommand(Command cmd){
        commands.remove(cmd);
    }
}
