package POTD;

// Swapping pair makes equal sum 
public class June05 {

    public static void main(String[] args) {

        int arr1[] = { 4, 1, 2, 1, 1, 2 };
        int arr2[] = { 3, 6, 3, 3 };
        swap(arr1, arr2);

    }

    public static void swap(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                int temp1 = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp1;

                // check for sum is equal
                if (sum(arr1) == sum(arr2)) {
                    break;
                    // System.out.print(true + " ");
                    // System.out.println();
                    // System.out.print(arr1[i] + " " + arr2[j]);
                }
                int temp2 = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp2;
            }
        }
        // System.out.println(false);

    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
