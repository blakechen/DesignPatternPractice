package idv.blake;

public class ConfigObject {

    public String getKey() {
        return this.getClass().toString() + "." + this.toString();
    }
}
