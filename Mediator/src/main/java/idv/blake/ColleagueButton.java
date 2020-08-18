package idv.blake;

public class ColleagueButton implements Colleague{
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

}
