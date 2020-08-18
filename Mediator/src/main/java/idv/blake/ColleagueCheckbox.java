package idv.blake;

import java.awt.event.ItemEvent;

public class ColleagueCheckbox implements Colleague{
    private Mediator mediator;
    private boolean enabled;
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void itemStateChanged(ItemEvent event) {
        mediator.colleagueChanged(this);
    }

    public boolean getStatus() {
        return false;
    }
}
