package Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "newdata.txt";
            FaylOxu faylOxu = new FaylOxu();
            faylOxu.faylOxu(path);
            System.out.println("Done!");
        }
        catch (RuntimeException e)
        {
            System.out.println("Failure");
        }

    }
}
