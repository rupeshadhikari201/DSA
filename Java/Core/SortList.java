package CORE;
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code

class Checker implements Comparator<Student> {
    
    public int compare(Student s1, Student s2) {
        
        // if (s1.getCgpa() > s2.getCgpa()) return 1;
        // if (s1.getCgpa() < s2.getCgpa()) return -1;
        if(s1.getFname() == s2.getFname()){
            return s1.getId()-s2.getId();
        }
        else if (s1.getCgpa() == s2.getCgpa() ) {
            return s1.getFname().compareTo(s2.getFname());
        }
        else {
            return Double.compare(s2.getCgpa(), s1.getCgpa());
        }
    }
}
public class SortList
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Checker checker = new Checker();
        Collections.sort(studentList, checker);
        // Collections.sort(studentList);
        // Collections.sort(studentList);
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
