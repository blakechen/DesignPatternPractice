package idv.blake;

import idv.blake.vo.Driver;
import idv.blake.vo.IOPort;
import idv.blake.vo.Monitor;
import idv.blake.vo.Process;


public abstract class AbstractFactory {
    public abstract Driver createDriver(String type, int index);
    public abstract Process createProcess(int id);
    public abstract IOPort createIOPort(int address);
    public abstract Monitor createMonitor(int id);

}
