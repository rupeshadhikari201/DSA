package POTD;

import Patterns.seven;

// Find the N-th characte      
/*
Input:
s = "1100"
r = 2
n = 3
Output: 1
*/
public class March09 {
    public static void main(String[] args) {

        String s = "1100";
        int r = 2;
        int n = 3;
        StringBuilder res = new StringBuilder();

        for (int j = 0; j < r; j++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    res.append("10");
                } else if (s.charAt(i) == '0') {
                    res.append("01");
                }
            }
            s = res.toString();
            res.delete(0, res.length());

        }
        System.out.println(s);
        System.out.println(s.charAt(0));
    }

}
