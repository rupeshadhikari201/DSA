package Core;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Users implements Serializable {    
    String name;
    String id;

    public Users(String name, String id) {
        this.name = name;
        this.id = id;
    }



}

public class OOSExample {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Users u;
        // u.id = "21BCS11201";
        // u.name = "Rupesh";

        // List<Users> empDetails = new ArrayList<Users>();
        // empDetails.add(new Users("21BCS11201", "Rupesh"));
        // empDetails.add(new Users("21BCS11202", "Rupesh"));
        // empDetails.add(new Users("21BCS11203", "Rupesh"));
        // empDetails.add(new Users("21BCS11204", "Rupesh"));

        Users uu = new Users("21bcs11201", "Rupesh");
        
    try{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myFile.txt"));
        oos.writeObject(uu);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myFile.txt"));
        // List<Users> readUsers = (List<Users>) ois.readObject();
        Users allUsers = (Users) ois.readObject();

       System.out.println(allUsers.id + " " +allUsers.name);

    } catch (IOException e) {
        e.printStackTrace();
    }
    // catch (EOFException e) {
        
    // }
    }
}