package idv.blake.polymorphicfactorymethod;

import idv.blake.simplefactorymethod.Drive;

public class LinuxDriveManager extends DriveManager {

    @Override
    protected Drive createDrive(String type, int index) {
        Drive drive = null;
        switch (type) {
            case "SATA":
                drive = new LinuxSATADrive(index);
                break;
            case "USB":
                drive = new LinuxUSBDrive(index);
                break;
            default:
                throw new RuntimeException(("Unsupported drive type: " + type));
        }
        return drive;
    }
}
