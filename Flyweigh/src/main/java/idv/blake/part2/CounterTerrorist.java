package idv.blake.part2;

public class CounterTerrorist implements Player {

    // Intrinsic Attribute
    private final String task;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        task = "DIFFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + task);
    }
}
