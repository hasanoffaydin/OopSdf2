package Task1;

import java.io.*;

public class FaylOxu {
    public void faylOxu(String path) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            String longword = "";
            while((line = bufferedReader.readLine())!=null){
                if(line.length() > longword.length()) {
                    longword = line;
                }
            }
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(path,true);
            fileWriter.write("\n" + longword + "-> En uzun soz");
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("Some error has occured : " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
