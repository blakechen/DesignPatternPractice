package idv.blake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigStringTest {

    @Test
    public void test_print() {
        BigString bigString = new BigString("1212123");
        assertEquals("big_1;big_2;big_1;big_2;big_1;big_2;big_3;", bigString.print());
    }
}
