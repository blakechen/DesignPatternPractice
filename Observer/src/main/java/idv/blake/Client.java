package idv.blake;

import java.awt.image.PixelGrabber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class Client implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private Result result;
    private Command command;

    public Client(Command command) {
        this.command=command;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            if (observer != null) {
                observer.update(this);
            }
        }
    }

    public void setResult(Result result) {
        this.result = result;
        notifyObserver();
    }

    public Command getCheckCommand() {
        return null;
    }

    public Result getResult() {
        return this.result;
    }
}
