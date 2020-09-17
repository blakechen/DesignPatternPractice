package idv.blake.gossip;

// <command> ::= <repeat> | <primitive>
public class Command implements Node {
    private Node node;

    @Override
    public void parse(Context context) {
        if(context.currentToken().equals("REPEAT")) {
            node = new Repeat();
        } else {
            node = new Primitive();
        }
        node.parse(context);
    }

    @Override
    public void execute() {
        node.execute();
    }
}
