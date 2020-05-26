package idv.blake;

public interface State {
    void powerOff(Host host);
    void powerOn(Host host);
    String diagnostic(Host host);
    void up(Host host);
    void down(Host host);

}
