package idv.blake.ploymorphicfactorymethod;

import idv.blake.polymorphicfactorymethod.DriveManager;
import idv.blake.polymorphicfactorymethod.WinDriveManager;
import idv.blake.polymorphicfactorymethod.WinSATADrive;
import idv.blake.polymorphicfactorymethod.WinUSBDrive;
import idv.blake.simplefactorymethod.Drive;
import org.junit.Assert;
import org.junit.Test;

public class WinDriveManagerTest {
    @Test
    public void createWindowsUSBDrive() {
        DriveManager dm = new WinDriveManager();
        Drive drive = dm.getDrive("USB", 0);
        Assert.assertEquals(WinUSBDrive.class, drive.getClass());
    }

    @Test
    public void createWindowsSATADrive() {
        DriveManager dm = new WinDriveManager();
        Drive drive = dm.getDrive("SATA", 0);
        Assert.assertEquals(WinSATADrive.class, drive.getClass());
    }

    @Test
    public void createUnsupportedWinSASDrive() {
        DriveManager dm = new WinDriveManager();

        try {
            Drive drive = dm.getDrive("SAS", 0);
        } catch (RuntimeException e) {
            Assert.assertTrue("Unsupported drive type 'SAS' throws a RuntimeException", true);
        }

    }
}
