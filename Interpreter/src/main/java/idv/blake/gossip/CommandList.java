package idv.blake.gossip;

import java.util.ArrayList;
import java.util.List;

// <command list> ::= <command>* END
public class CommandList implements Node {
    private List<Node> commands = new ArrayList<Node>();

    @Override
    public void parse(Context context) {
        while (true) {
            if(context.currentToken() == null) {
                System.err.println("Missing 'END'");
                break;
            }else if(context.currentToken().equals("END")) {
                context.skipToken("END");
                break;
            }else {
                Node command = new Command();
                command.parse(context);
                commands.add(command);
            }
        }
    }

    @Override
    public void execute() {
        commands.stream().forEach(Node::execute);
    }
}
