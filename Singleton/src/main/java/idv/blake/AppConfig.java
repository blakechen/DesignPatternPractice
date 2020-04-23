package idv.blake;

public class AppConfig {
    private volatile static AppConfig instance = new AppConfig();
    private int timeout = 0;
    private int port = 0;
    private String workingDir = "";

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }


    private AppConfig() {
    }

    public static AppConfig getInstance() {
        if (null == instance) {
            synchronized (AppConfig.class) {
                instance = new AppConfig();
            }
        }
        return instance;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
