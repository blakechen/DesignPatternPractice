package idv.blake.gossip;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class ProgramTest {

    @Test
    public void test_program() throws URISyntaxException, IOException {
        Node node = new Program();
        node.parse(new Context("dsl_test.txt"));
        node.execute();
    }
}
