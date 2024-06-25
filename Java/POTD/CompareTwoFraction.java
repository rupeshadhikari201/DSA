package POTD;

public class CompareTwoFraction {

    public static void main(String[] args) {

        String str = "99/100, 99/99";
        // Output: 5/6
        // Explanation: 5/6=0.8333 and 11/45=0.2444, So 5/6 is greater fraction.
        String parts[] = str.split(",");
        String part1[] = parts[0].split("/");
        int num1 = Integer.parseInt(part1[0]);
        int den1 = Integer.parseInt(part1[1]);

        String part2[] = parts[1].split("/");

        int num2 = Integer.parseInt(part2[0].strip());
        int den2 = Integer.parseInt(part2[1].strip());

        float fracOne = (float) num1 / den1;
        float fracTwo = (float) num2 / den2;
        System.out.println(fracOne);
        System.out.println(fracTwo);
        System.out.println((num1 / den1) + " " + den1 / den2);
        System.out.println(fracOne > fracTwo ? parts[0].strip() : parts[1].strip());

    }
}
