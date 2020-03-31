package idv.blake;

import idv.blake.vo.*;
import idv.blake.vo.Process;

public class LinuxFactory extends AbstractFactory {
    @Override
    public Driver createDriver(String type, int index) {
        SimpleDriveFactory driveFactory = new SimpleDriveFactory();
        return driveFactory.createLinuxDrive(type, index);
    }

    @Override
    public Process createProcess(int id) {
        return new LinuxProcess(id);
    }

    @Override
    public IOPort createIOPort(int address) {
        return new LinuxIOPort(address);
    }

    @Override
    public Monitor createMonitor(int id) {
        return new LinuxMonitor(id);
    }
}
