package String;

import java.util.*;

public class AllSubstring {

    public static void main(String[] args) {

        List<String> output = new ArrayList<>();
        output = allSubstrings("acdcdacdc");

        for (String i : output) {
            System.out.print(i + " ");
        }
    }

    public static List<String> allSubstrings(String s) {

        List<String> res = new ArrayList<String>();

        int len = s.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                String temp = s.substring(i, j);
                res.add(temp);
            }
        }

        return res;
    }
}
