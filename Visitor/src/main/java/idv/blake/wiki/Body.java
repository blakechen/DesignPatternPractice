package idv.blake.wiki;

public class Body {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
