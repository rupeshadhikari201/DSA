package String;

public class MaximumLengthOfRepeatedSubarray {

    public static void main(String[] args) {

        int nums1[] = { 1, 2, 3, 2, 1 };
        int nums2[] = { 3, 2, 1, 4, 7 };
        // ans == 321

        String s = "xyyz";
        int freq[] = new int[26];
        for (char i : s.toCharArray()) {
            freq[i - 'a']++;
        }

        for (int i : freq) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println('c' - 'a');
    }
}
