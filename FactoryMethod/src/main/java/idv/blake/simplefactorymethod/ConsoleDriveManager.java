package idv.blake.simplefactorymethod;

public class ConsoleDriveManager {
    private SimpleDriveFactory factory;

    public ConsoleDriveManager(SimpleDriveFactory factory) {
        this.factory = factory;
    }

    public Drive getDrive(String type, int index) {
        Drive drive = factory.getDrive(type, index);
        drive.doQuickSMARTCheck();
        drive.updateFreeSpace();
        return drive;
    }
}
