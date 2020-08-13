package idv.blake;

public class PlainTextPropertyBuilder implements ConfigPropertyBuilder {
    Config product;

    public PlainTextPropertyBuilder(){
        this.product=new PlainTextConfig();
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
