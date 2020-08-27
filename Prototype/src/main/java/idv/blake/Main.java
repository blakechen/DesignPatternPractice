package idv.blake;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox messageBox = new MessageBox('*');
        MessageBox messageBox1 = new MessageBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",messageBox);
        manager.register("slash box",messageBox1);

        Product product = manager.create("strong message");
        product.used("Hello word.");
        Product product2 = manager.create("warning box");
        product2.used("Hello word.");
        Product product3 = manager.create("slash box");
        product3.used("Hello word.");
    }
}
