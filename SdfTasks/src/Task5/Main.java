package Task5;

public class Main {
    public static void main(String[] args) {
        Handler addhandler = new AddHandler();
        Handler addHandler1 = new AddHandler1();
        Handler addHandler2 = new AddHandler2();
        addhandler.setNext(addHandler1);
        addHandler1.setNext(addHandler2);
        String input = "Hello";
        String output = addhandler.process(input);
        input = output;
        String output1 = addHandler1.process(input);
        System.out.println(output);
        System.out.println(output1);

    }
}
