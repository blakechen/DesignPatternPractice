package idv.blake.polymorphicfactorymethod;

import idv.blake.simplefactorymethod.Drive;

public abstract class DriveManager {
    public Drive getDrive(String type,int index) {
        Drive drive = createDrive(type, index);
        drive.updateFreeSpace();
        drive.doQuickSMARTCheck();
        return drive;
    }

    protected abstract Drive createDrive(String type, int index);
}
