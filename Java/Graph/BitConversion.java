package Graph;

public class BitConversion {

    public static void main(String[] args) {

        int a = 1;
        String s = Integer.toBinaryString(a);
        String.format("%32s", s).replaceAll(" ", "0");
        System.out.println(s);
    }
}
