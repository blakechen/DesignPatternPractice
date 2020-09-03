package idv.blake.part2;

public class Terrorist implements Player {

    // Intrinsic Attribute
    private final String task;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist() {
        task = "PLANT A BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        // Assign a weapon
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        //Work on the Mission
        System.out.println("Terrorist with weapon " + weapon + "|" + " Task is " + task);
    }
}
