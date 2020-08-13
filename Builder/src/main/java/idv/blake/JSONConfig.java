package idv.blake;

public class JSONConfig implements Config {

    StringBuffer productContent = new StringBuffer();

    public JSONConfig(){

    }

    @Override
    public String print() {
        return "{"+productContent.toString().substring(0,productContent.toString().length()-1)+"}";
    }

    @Override
    public void addAttribute(String attribute,String value) {
        productContent.append("\""+attribute+"\":\""+value+"\",");
    }
}
