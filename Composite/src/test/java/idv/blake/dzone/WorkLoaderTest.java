package idv.blake.dzone;

import org.junit.Test;

public class WorkLoaderTest {
    @Test
    public void test_workLoader() {
        Engineer ajay = new Engineer(1001l, "Ajay", "Developer", Department.ENG);
        Engineer vijay = new Engineer(1002l, "Vijay", "SR. Developer", Department.ENG);
        Engineer martin = new Engineer(1004l, "Martin", "QA", Department.ENG);
        Manager kim = new Manager(1005l, "Kim", "Manager", Department.ENG);

        Engineer jay = new Engineer(1003l, "Jay", "Lead", Department.ENG);
        Engineer shailesh = new Engineer(1010l, "Shailesh", "Engineer", Department.ENG);
        Engineer anders = new Engineer(1006l, "Andersen", "Developer", Department.ENG);
        Manager niels = new Manager(1007l, "Niels", "Sr. Manager", Department.ENG);

        Engineer robert = new Engineer(1008l, "Robert", "Developer", Department.ENG);
        Manager rachelle = new Manager(1009l, "Rachelle", "Product Manager", Department.ENG);

        kim.manages(ajay);
        kim.manages(martin);
        kim.manages(vijay);

        niels.manages(jay);
        niels.manages(anders);
        niels.manages(shailesh);

        rachelle.manages(kim);
        rachelle.manages(niels);
        rachelle.manages(robert);

        WorkLoader workLoad = new WorkLoader("work.properties");
        workLoad.getWorkList().stream().forEach(work -> {
            rachelle.assignWork(rachelle, work);
        });
        rachelle.performWork();
    }
}
