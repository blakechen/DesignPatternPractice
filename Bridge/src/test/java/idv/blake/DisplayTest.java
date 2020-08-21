package idv.blake;

import org.junit.Test;

import java.beans.Transient;

public class DisplayTest {

    @Test
    public void displayTest(){
        Display display1 = new Display(new StringDisplayImpl("Hello,Taiwan."));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        display1.display();
        display2.display();
        display3.display();
        display3.multDisplay(3);
    }

}
