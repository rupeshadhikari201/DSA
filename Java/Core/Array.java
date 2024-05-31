package CORE;

class Students {

    String name;
    int id;
    String address;

}


public class Array {

    public static void main(String[] args) {
        
        // int random = (int) (Math.random() * 10);
        
        int array[][] = new int[3][4];
        System.out.println("Printing through ForLoop :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing through EnhancedForLoop :");
        for (int n[] : array) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        
        //? Jagged Array:
        int arrayTwo[][] = new int[3][];
        arrayTwo[0] = new int[4];
        arrayTwo[1] = new int[5];
        arrayTwo[2] = new int[3];

        System.out.println(arrayTwo.length);
        System.out.println(arrayTwo[0].length);
        System.out.println(arrayTwo[1].length);
        System.out.println(arrayTwo[2].length);

        System.out.println("Printing jagged Array using ForLoop : ");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                arrayTwo[i][j] = (int) (Math.random() * 10);
                System.out.print(arrayTwo[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing jagged Array using EnhancedForLoop : ");
        for (int j[] : arrayTwo) {
            for (int k : j) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        //? Array of Objects: 
        Students s = new Students();
        s.name = "Rupesh";
        s.id = 21;
        s.address = "Nepal";

        Students t = new Students();
        t.name = "Rupesh";
        t.id = 21;
        t.address = "India";

        Students u = new Students();
        u.name = "Rupesh";
        u.id = 21;
        u.address = "China";

        Students studs[] = new Students[3];
        studs[0] = s;
        studs[1] = t;
        studs[2] = u;

        System.out.println("The Array of Obects is : ");
        for (int i = 0; i < studs.length; i++) {
            System.out.println(studs[i].name + ": " + studs[i].id + ": " + studs[i].address);
        }
        System.out.println("The Array of Objects Using ForEachLop : ");
        for (Students m : studs) {
            System.out.println(m.name + ": " + m.id + ": " + m.address);
        }
    } 
}
