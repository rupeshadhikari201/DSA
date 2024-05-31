package Core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileNotFoundException;

public class DataInputStreamExample {
    
    public static void main(String args[]) {

        DataInputStream dis = new DataInputStream(System.in);
        try{
            FileOutputStream fos = new FileOutputStream("MyFile.txt");
            System.out.println("Enter you input, (add @at the end) : ");
            char ch;

            while ((ch = (char) dis.read()) != '@') {
                fos.write(ch);
            }
            fos.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
