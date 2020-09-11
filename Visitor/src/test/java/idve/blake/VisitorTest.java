package idve.blake;

import idv.blake.wiki.Car;
import idv.blake.wiki.PrintVisitor;
import idv.blake.wiki.Visitor;
import org.junit.Test;

public class VisitorTest {

    @Test
    public void test_visitor(){
        Car car = new Car();
        Visitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
}
