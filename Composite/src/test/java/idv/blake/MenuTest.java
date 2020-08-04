package idv.blake;

import org.junit.Test;

public class MenuTest {
    @Test
    public void testPrint() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Brakefirst");
        MenuComponent dinerMenu = new Menu("DINER Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT Menu", "Dessert of course!");

        MenuComponent allMenu = new Menu("ALL menus", "ALL menus combined");

        allMenu.add(pancakeHouseMenu);
        allMenu.add(dinerMenu);
        allMenu.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti", true, 3.89));
        dinerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
