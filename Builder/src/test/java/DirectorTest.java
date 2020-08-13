import idv.blake.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    @Test
    public void test_plain_text_constructor() {
        ConfigPropertyBuilder configPropertyBuilder = new PlainTextPropertyBuilder();
        Director director=new Director(configPropertyBuilder);
        Config config=director.constructor();
        assertEquals("[userID=TEST][userPassword=P@ssw0rd]", config.print());
    }

    @Test
    public void test_json_constructor() {
        ConfigPropertyBuilder configPropertyBuilder = new JSONPropertyBuiler();
        Director director=new Director(configPropertyBuilder);
        Config config=director.constructor();
        assertEquals("{\"userID\":\"TEST\",\"userPassword\":\"P@ssw0rd\"}", config.print());
    }
}
