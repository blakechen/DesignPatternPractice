package idv.blake;

public abstract class ConfigParser {

    protected PersonData personData = null;

    public final PersonData doParse() {
        readData();
        parseToken();
        buildModel();
        validate();
        return personData;
    }

    abstract protected void buildModel();

    abstract protected void parseToken();

    abstract protected void validate();

    abstract protected void readData();
}
