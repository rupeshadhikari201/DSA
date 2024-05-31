package CORE;
/* Comparator Interface in JAVA 
 * Collection  : Interface
 * Collections : Class
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class ComparatorInJava {

    public static void main(String[] args) {
        
        List<Integer> age = new ArrayList<>();
        age.add(20);
        age.add(29);
        age.add(38);
        age.add(41);
        age.add(53);
        age.add(60);
        age.add(66);
        age.add(27);

        System.out.println("Before Sorting : "+ age);
        Collections.sort(age);
        System.out.println("After Sorting : " + age);
        

        // Comperator Intrface
        Comparator<Integer> com = new Comparator<Integer>(){

            public int compare(Integer i, Integer j){

                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(age, com);
        System.out.println(age);


        // List of Students Objects
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(50, "Rupesh"));
        studs.add(new Student(51, "Prins"));
        studs.add(new Student(35, "Ritesh"));
        studs.add(new Student(95, "Milan"));
        studs.add(new Student(48, "Aman"));


        Collections.sort(studs, null);
        // Comparator<String> comStr = new Comparator<String>();
        // {
        //     public void compare(String s1, String s2){
                
        //     }
        // }

   

    }
    
}
