package idv.blake;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.TextEvent;

public class ColleagueTextField implements Colleague{
    private Mediator mediator;
    private boolean enabled;
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.enabled=enabled;
    }

    public void textValueChanged() {
        mediator.colleagueChanged(this);
    }

    public String getText() {
        return null;
    }
}
