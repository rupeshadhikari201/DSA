package POTD;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {

    public static void main(String[] args) {

        String str = "(aa(bdc))p(dee)";
        // Output: 1 2 2 1 3 3
        System.out.println(bracketNumbers(str));
    }

    public static ArrayList<Integer> bracketNumbers(String str) {

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
                st.add(count);
                ar.add(count);
            } else if (str.charAt(i) == ')') {
                if (!st.isEmpty()) {
                    int top = st.pop();
                    ar.add(top);
                }

            }
        }
        return ar;
    }
}
