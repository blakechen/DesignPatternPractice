package idv.blake;

public class JSONPropertyBuiler implements ConfigPropertyBuilder{

    Config product;

    public JSONPropertyBuiler(){
        this.product=new JSONConfig();
    }
    @Override
    public void buildPart(String attribute,String value) {
        product.addAttribute(attribute,value);
    }

    @Override
    public Config build() {
        return product;
    }
}
