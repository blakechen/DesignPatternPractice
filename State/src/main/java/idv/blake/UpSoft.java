package idv.blake;

class UpSoft implements State {
    @Override
    public void powerOff(Host host) {
        host.doPowerOff(60);
    }

    @Override
    public void powerOn(Host host) {
        System.out.println("Cannot power on under up soft state.");
    }

    @Override
    public String diagnostic(Host host) {
        String result = host.inBandDiagnostic();
        if ("" == result)
            return host.outOfBandDiagnostic();
        else
            return result;
    }

    @Override
    public void up(Host host) {
        host.incAttempt();
        if (host.getAttempt() >= host.getMaxAttempt())
            host.changeState(host.UP_HARD);
    }

    @Override
    public void down(Host host) {
        host.changeState(host.DOWN_HARD);
    }
}
