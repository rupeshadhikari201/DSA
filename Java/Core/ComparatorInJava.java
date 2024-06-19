package Java.Core;

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
        return name + age;
        // return name;
        // return "name : " + name;
        // return "age : " + age;
        // return "Student [age=" + age + ", name=" + name + "]";
    }

}

// compare by name
class ComparebyName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// compare by age
class CompareByAge implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
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

        // System.out.println("Before Sorting : " + age);
        // Collections.sort(age);
        // System.out.println("After Sorting : " + age);

        // Comperator Intrface
        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Collections.sort(age, com);
        // System.out.println(age);

        // List of Students Objects
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(50, "Rupesh"));
        studs.add(new Student(51, "Prins"));
        studs.add(new Student(35, "Ritesh"));
        studs.add(new Student(95, "Milan"));
        studs.add(new Student(48, "Aman"));
        System.out.println("before sorting age using comperator :" + studs);
        Collections.sort(studs, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });

        // Collections.sort(studs, null);
        System.out.println("after  sorting age using comperator :" + studs);

        // System.out.println("before sorting by name :");
        Collections.sort(studs, new ComparebyName());
        System.out.println("after sorting by name :" + studs);
        Collections.sort(studs, new CompareByAge());
        System.out.println("after sorting by age :" + studs);
    }

}
