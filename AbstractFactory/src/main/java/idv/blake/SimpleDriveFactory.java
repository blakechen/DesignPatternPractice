package idv.blake;

import idv.blake.vo.Driver;
import idv.blake.vo.LinuxUSBDrive;
import idv.blake.vo.WinUSBDrive;

public class SimpleDriveFactory {
    public Driver createWindowsDrive(String type, int index) {
        return new WinUSBDrive();
    }

    public Driver createLinuxDrive(String type, int index) {
        return new LinuxUSBDrive();
    }
}
