package Task1;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "data.txt";
        FaylOxu faylOxu = new FaylOxu();
        faylOxu.faylOxu(path);
        System.out.println("Melumatlar tamamlandi file baxa bilersiniz :)");

    }
}
