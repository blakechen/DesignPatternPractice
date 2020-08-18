package idv.blake;

public class ConcreteMediator implements Mediator{
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCanecel;

    @Override
    public void createColleagues() {
        checkGuest = new ColleagueCheckbox();
        checkLogin = new ColleagueCheckbox();
        textUser = new ColleagueTextField();
        textPass = new ColleagueTextField();
        buttonOk = new ColleagueButton();
        buttonCanecel = new ColleagueButton();

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCanecel.setMediator(this);
    }

    @Override
    public void colleagueChanged(Colleague colleague) {
        if (checkGuest.getStatus()) {
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        } else {
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }

    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnabled(true);
            } else {
                buttonOk.setColleagueEnabled(false);
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
        }
    }
}
