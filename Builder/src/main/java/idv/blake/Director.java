package idv.blake;

public class Director {
    private ConfigPropertyBuilder configPropertyBuilder;

    public Director(ConfigPropertyBuilder configPropertyBuilder) {
        this.configPropertyBuilder = configPropertyBuilder;
    }

    public Config constructor(){
        configPropertyBuilder.buildPart("userID","TEST");
        configPropertyBuilder.buildPart("userPassword","P@ssw0rd");
        return configPropertyBuilder.build();
    }
}
