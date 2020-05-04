package idv.blake;

@lombok.Data
public class Result {
    private String status;
    private String message;

    public Result(String status,String message) {
        this.status=status;
        this.message=message;
    }

    public Result(String message) {
        this.message = message;
    }
}
