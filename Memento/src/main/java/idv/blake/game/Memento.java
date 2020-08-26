package idv.blake.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    ArrayList<String> fruits;
    //narrow interface start
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    //narrow interface end

    //wide interface start
    public int getMoney() {
        return money;
    }
    public List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
    //wide interface end
}
