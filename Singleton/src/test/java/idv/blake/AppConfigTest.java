package idv.blake;

import org.junit.Assert;
import org.junit.Test;

public class AppConfigTest {
    @Test
    public void default_instance_is_not_null() {
        Assert.assertNotNull(AppConfig.getInstance());
    }

    @Test
    public void call_getInstance_twice_gets_the_same_instance() {
        Assert.assertEquals(AppConfig.getInstance(), AppConfig.getInstance());
    }

    @Test(expected = IllegalAccessException.class)
    public void cannot_call_the_default_constructor() throws Exception {
        String className = "idv.blake.AppConfig";
        Class<?> c = Class.forName(className);
        Assert.assertNotNull((AppConfig)c.newInstance());
    }
}
