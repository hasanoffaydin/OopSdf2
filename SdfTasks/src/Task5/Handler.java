package Task5;


public interface Handler {
    String process(String input) throws RuntimeException;
    void setNext(Handler nextHandler);

}
