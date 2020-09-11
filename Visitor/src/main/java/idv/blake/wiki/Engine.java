package idv.blake.wiki;

public class Engine {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
