package idv.blake;

public class Result {
    public static final int OK = 1;

    public static final int WAANING = 2;

    public static final int CRITICAL = 3;
    private int status = OK;

    private String message = "";

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(int statusCode) {
        this.status = statusCode;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}

