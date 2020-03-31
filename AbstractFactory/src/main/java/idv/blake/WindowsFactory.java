package idv.blake;

import idv.blake.vo.*;
import idv.blake.vo.Process;

public class WindowsFactory extends AbstractFactory {


    @Override
    public Driver createDriver(String type, int index) {
        SimpleDriveFactory driveFactory = new SimpleDriveFactory();
        return driveFactory.createWindowsDrive(type, index);
    }

    @Override
    public Process createProcess(int id) {
        return new WinProcess(id);
    }

    @Override
    public IOPort createIOPort(int address) {
        return new WinIOPort(address);
    }

    @Override
    public Monitor createMonitor(int id) {
        return new WinMonitor(id);
    }

}
