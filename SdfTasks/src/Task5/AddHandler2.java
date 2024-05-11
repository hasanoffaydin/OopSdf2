package Task5;

public class AddHandler2 implements Handler{

    public Handler nextHandler;


    @Override
    public String process(String input) throws RuntimeException {
        input = input + "C";
        if (nextHandler != null){
            nextHandler.process(input);
        }
        return input;
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
