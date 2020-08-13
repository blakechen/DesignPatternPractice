package idv.blake;

public interface ConfigPropertyBuilder {
    public void buildPart(String attribute,String value) ;
    public Config build();
}
