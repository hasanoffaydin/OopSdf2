package Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FaylOxu {

    public void faylOxu(String path)
    {
        ArrayList<String> words = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                if(line.length() > 5) {
                    words.add(line);
                }
            }
            if(words.size() != 0)
            {
                System.out.println("Uzunlugu 5 den boyuk sozler var");
                throw new RuntimeException();
            }
        } catch (IOException e) {
            System.out.println("Some error has occured : " + e.getMessage());
        }
    }
}
