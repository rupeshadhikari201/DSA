package Java.POTD;

public class NoOfRecInCircle {

    public static void main(String[] args) {
        int r = 2;
        System.out.println(rectanglesInCircle(r));
    }

    public static int rectanglesInCircle(int r) {
        // code here
        int ans = 0;
        for (int i = 1; i < 2 * r; i++) {
            for (int j = 1; j < 2 * r; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) <= 4 * Math.pow(r, 2)) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
