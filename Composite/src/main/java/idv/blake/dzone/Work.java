package idv.blake.dzone;

import java.util.ArrayList;
import java.util.List;

public class Work {
    private Calculator workType;
    private List<String> work = new ArrayList<String>();

    public Work(Calculator workType, List<String> work) {
        super();
        this.workType = workType;
        this.work = work;
    }

    public Calculator getWorkType() {
        return workType;
    }

    public void setWorkType(Calculator workType) {
        this.workType = workType;
    }

    public List<String> getWork() {
        return work;
    }

    public void setWork(List<String> work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workType=" + workType +
                ", work=" + work +
                '}';
    }
}
