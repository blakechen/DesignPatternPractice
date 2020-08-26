package idv.blake.game;

import java.util.*;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();
    private static String[] fruitsname = {"Apple", "Banana", "Grape", "Orange"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMeney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("Money increase!!");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("Money device 2");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("Get fruit");
            fruits.add(f);
        } else {
            System.out.println("Do nothing");
        }
    }

    public Memento createMemento() {
        Memento memento = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("Good for eat")) {
                memento.addFruit(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String toString(){
        return "[money=" + money + "]+fruits=" +  fruits + "]";
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "Good";
        }
        return prefix+fruitsname[random.nextInt(fruitsname.length)];
    }

}

