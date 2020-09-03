package idv.blake;

public class BigChar {
    private char charname;

    private String fontdata;

    public BigChar(char charname) {
        this.charname = charname;
        try {
//            String line;
            StringBuffer buf = new StringBuffer();
            buf.append("big_" + charname + ";");
            this.fontdata = buf.toString();
        } catch (Exception e) {
            this.fontdata = charname + "?";
        }
    }

    public String print() {
       return fontdata;
    }
}
