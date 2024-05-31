package CORE;
public class Anagtam {
    
    public static void main(String[] args) {
        

        String s1 = "melon";
        String s2 = "lemon";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        
        int length1 = c1.length;
        System.out.println(length1);
        int length2 = c2.length;
        

        char sorted1[];
        char sorted2[];

        //sorting the array
        for (int i = 0; i < length1 - 1; i++) {

            if (c1[i] > c1[i + 1]) {
                char temp = c1[i];
                c1[i] = c1[i + 1];
                c1[i + 1] = temp;
                i = -1;
            }
            
        }
        for (int i = 0; i < length2 - 1; i++) {

            if (c2[i] > c2[i + 1]) {
                char temp = c2[i];
                c2[i] = c2[i + 1];
                c2[i + 1] = temp;
                i = -1;
            }
        }
        
        

        for(int i =0; i<c1.length; i++ ){
            sorted1[i] = c1[i];
        }
        for(int i =0; i<c1.length; i++ ){
            System.out.println(sorted1[i]);
        }
        // System.out.println();
        // for(char a : c1){
        //     System.out.print(a + " ");
        //     sorted1[] = 
        // }
        // System.out.println();
        // for(char a : c2){
        //     System.out.print(a + " ");
        // }
    }

}
