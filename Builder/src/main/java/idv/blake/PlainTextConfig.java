package idv.blake;

public class PlainTextConfig implements Config {

    StringBuffer productContent = new StringBuffer();

    @Override
    public String print() {
        return productContent.toString();
    }

    @Override
    public void addAttribute(String attribute,String value) {
        productContent.append("["+attribute+"="+value+"]");
    }
}
