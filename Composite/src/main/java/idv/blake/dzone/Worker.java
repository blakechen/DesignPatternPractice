package idv.blake.dzone;

public interface Worker {
    void assignWork(Employee manager, Work work);
    void performWork();
}
