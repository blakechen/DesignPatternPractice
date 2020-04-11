package idv.blake.simplefactorymethod;

public class SimpleDriveFactory {
    Drive getDrive(String type,int index) {
        Drive drive = null;
        switch (type) {
            case "SATA":
                drive = new SATADrive(index);
                break;
            case "USB":
                drive = new USBDrive(index);
            default:
                throw new RuntimeException("Unsupport drive type :" + type);
        }
        return drive;
    }
}
