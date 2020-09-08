package idv.blake.wiki;

public class SimpleWindow implements Window {

    @Override
    public void draw() {
        System.out.println("Simple Window draw some thing");
    }

    @Override
    public String getDescription() {
        return "Simple Window";
    }
}
