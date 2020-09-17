package idv.blake.gossip;

// <program> ::= PROGRAM <command list>
public class Program implements Node{
    private Node commandList;

    @Override
    public void parse(Context context) {
        context.skipToken("PROGRAM");
        commandList = new CommandList();
        commandList.parse(context);
    }

    @Override
    public void execute() {
        commandList.execute();
    }
}
