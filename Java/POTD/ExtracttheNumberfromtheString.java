package POTD;

import java.util.Arrays;

public class ExtracttheNumberfromtheString {
    public static void main(String[] args) {

        // Start the timer
        long startTime = System.nanoTime();

        String s = "This is alpha 55970 ";
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 10000000; i++) {
        // sb.append("word" + i + " ");
        // }
        // String s = sb.toString();

        // findMaxNumber(s);
        // findMax(s);
        System.out.println(findMaxNumberEfficient(s));

        // End the timer
        long endTime = System.nanoTime();

        // Calculate the duration
        long duration = (endTime - startTime);
        System.out.println("Execution time: " + duration + " nanoseconds");
        System.out.println("Execution time: " + duration / 1000000.0 + " milliseconds");
        System.out.println("Execution time: " + duration / 1000000000.0 + " seconds");
    }

    public static void findMax(String s) {
        String parts[] = s.split(" ");
        int max = 0;
        for (String str : parts) {

            if (str.matches("\\d+") && Integer.parseInt(str) > 0 && !str.contains("9")) {
                max = Integer.parseInt(str);
            }
        }
        System.out.println(max == 0 ? -1 : max);
    }

    public static int findMaxNumber(String s) {
        return Arrays.stream(s.split("\\s+"))
                .filter(word -> word.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num > 0 && !String.valueOf(num).contains("9"))
                .max()
                .orElse(-1);
    }

    public static long findMaxNumberEfficient(String s) {
        long max = -1;
        String words[] = s.split(" ");
        for (String i : words) {
            if (i.contains("9"))
                continue;

            if (i.contains("1") || i.contains("2") || i.contains("3") || i.contains("4") || i.contains("5")
                    || i.contains("6") || i.contains("7") || i.contains("8")) {
                Long num = Long.parseLong(i);
                // check max
                if (num > max) {
                    max = num;
                }

            }
        }
        return max;
    }
}
