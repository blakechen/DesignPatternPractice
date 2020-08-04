package idv.blake;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String descript;

    public Menu(String name, String descript) {
        this.name = name;
        this.descript = descript;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChile(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescript() {
        return descript;
    }

    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", " + getDescript());
        System.out.println("------------------");

        Iterator<Menu> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
