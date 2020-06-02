package idv.blake;

public class LCD {
    String message;

    public void display(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
