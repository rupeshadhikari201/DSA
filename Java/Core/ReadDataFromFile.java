package Core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFile {

    public static void main(String[] args) {
        
        try{
            FileInputStream fis = new FileInputStream("MyFile.txt");
            System.out.println("FILE CONTENT IS : ");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
