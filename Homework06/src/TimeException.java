//Jack Atkinson
public class TimeException extends Exception {
    public TimeException() {
        super("Exception: Invalid Time Entered");
    }

    public TimeException(String msg) {
        super(msg);
    }
}
