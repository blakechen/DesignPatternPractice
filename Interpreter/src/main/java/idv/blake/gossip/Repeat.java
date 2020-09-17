package idv.blake.gossip;

public class Repeat implements Node {
    private int number;
    private Node commandList;

    @Override
    public void parse(Context context) {
        context.skipToken("REPEAT");
        number = context.currentNumber();
        context.nextToken();
        commandList = new CommandList();
        commandList.parse(context);
    }

    @Override
    public void execute() {
        for(int i = 0; i < number; i++) {
            commandList.execute();
        }
    }
}
