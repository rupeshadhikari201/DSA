package Java.String;

public class BinaryRepresentation {

    public static void main(String[] args) {

        String s = "1000";
        BinaryToDecimal1(s);
    }

    // 1. using for loop
    public static void BinaryToDecimal1(String s) {

        int idx = 1;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '1') {
                ans = idx;
            }
            idx = idx * 2;
        }
        System.out.println(idx);
    }

}
