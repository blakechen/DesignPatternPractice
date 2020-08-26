package idv.blake;


import idv.blake.game.Gamer;
import idv.blake.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("Now:" + gamer);
            gamer.bet();

            System.out.println("Total" + gamer.getMeney());

            if (gamer.getMeney()>memento.getMoney()) {

                System.out.println("Save game");
                memento = gamer.createMemento();
            } else if (gamer.getMeney() < memento.getMoney() / 2) {
                System.out.println("Lose to much money!!Restore ");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
