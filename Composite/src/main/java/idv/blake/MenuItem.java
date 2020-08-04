package idv.blake;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name=name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print(){
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(V)");
        }
        System.out.println(", " + getPrice());
        System.out.println("  --"+getDescription());
    }
}
