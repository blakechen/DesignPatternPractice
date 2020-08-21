package idv.blake;

public class StringDisplayImpl implements DisplayImpl {

    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        println();
    }

    @Override
    public void rawClose() {
        println();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    private void println() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
