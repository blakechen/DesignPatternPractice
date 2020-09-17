package idv.blake.gossip;

// <primitive> ::= PRINT <string> | SPACE | BREAK | LINEBREAK
public class Primitive implements Node {
    private String name;
    private String text;

    @Override
    public void parse(Context context) {
        name = context.currentToken();
        context.skipToken(name);
        if (!(name.equals("PRINT") ||
                name.equals("BREAK") ||
                name.equals("LINEBREAK") ||
                name.equals("SPACE"))) {
            System.err.println("Undefined Command");
        }
        if (name.equals("PRINT")) {
            text = context.currentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equals("PRINT"))
            System.out.print(text);
        else if (name.equals("SPACE"))
            System.out.print(" ");
        else if (name.equals("BREAK"))
            System.out.println();
        else if (name.equals("LINEBREAK"))
            System.out.println("\n------------------------------");
    }
}
