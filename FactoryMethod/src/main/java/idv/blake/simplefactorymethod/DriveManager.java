package idv.blake.simplefactorymethod;

public class DriveManager {
    private SimpleDriveFactory factory;

    public DriveManager(SimpleDriveFactory factory) {
        this.factory = factory;
    }

    public Drive getDrive(String type, int index) {
        Drive drive = factory.getDrive(type, index);
        drive.doQuickSMARTCheck();
        drive.updateFreeSpace();
        return drive;
    }
}
