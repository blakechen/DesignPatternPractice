package idv.blake;

import idv.blake.vo.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SystemManagerTest {
    @Test
    public void usingWindowsFatory(){
        SystemManager sm = new SystemManager(new WindowsFactory());
        assertEquals(WinUSBDrive.class, sm.getDriver("USB", 0).getClass());
        assertEquals(WinIOPort.class, sm.getIOPort(0x00ff).getClass());
        assertEquals(WinProcess.class, sm.getProcess(3388).getClass());
        assertEquals(WinMonitor.class, sm.getMoitor(1).getClass());
    }

    @Test
    public void usingLinuxFatory(){
        SystemManager sm = new SystemManager(new LinuxFactory());
        assertEquals(LinuxUSBDrive.class, sm.getDriver("USB", 0).getClass());
        assertEquals(LinuxIOPort.class, sm.getIOPort(0x00ff).getClass());
        assertEquals(LinuxProcess.class, sm.getProcess(3388).getClass());
        assertEquals(LinuxMonitor.class, sm.getMoitor(1).getClass());
    }

}
