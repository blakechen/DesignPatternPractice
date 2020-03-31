package idv.blake;

import idv.blake.vo.Driver;
import idv.blake.vo.IOPort;
import idv.blake.vo.Process;
import idv.blake.vo.Monitor;

public class SystemManager {
    AbstractFactory factory = null;

    public SystemManager(AbstractFactory abstractFactor) {
        this.factory = abstractFactor;
    }

    public Driver getDriver(String type, int index) {
        Driver driver = factory.createDriver(type, index);
        driver.updateFreeSpace();
        driver.doQuickSMARTCheck();
        return driver;
    }

    public IOPort getIOPort(int address) {
        IOPort ioPort = factory.createIOPort(address);

        return ioPort;
    }

    public Process getProcess(int id) {
        Process process = factory.createProcess(id);
        return process;
    }

    public Monitor getMoitor(int id) {
        Monitor monitor = factory.createMonitor(id);
        return monitor;
    }
}
