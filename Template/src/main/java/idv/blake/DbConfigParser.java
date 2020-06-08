package idv.blake;

public class DbConfigParser extends ConfigParser {
    private String conStr = null;
    public DbConfigParser(String aConnStr) {
        conStr = aConnStr;
    }

    @Override
    protected void buildModel() {
        personData = new PersonData();
        personData.setName("Kay");
        personData.setHP(100);
    }

    @Override
    protected void parseToken() {
        System.out.println("parseToken...");
    }

    @Override
    protected void validate() {
        System.out.println("validate config data built from database...");
    }

    @Override
    protected void readData() {
        System.out.println("Read config data from database:" + conStr);

    }
}
