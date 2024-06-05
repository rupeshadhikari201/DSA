package Scaler.Array;

public class RotateMatrixBy90 {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printArray(arr);
        Transpose(arr);
        swapColumns(arr);
        printArray(arr);

    }

    public static int[][] Transpose(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {

                // 01 -> 10
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static int[][] swapColumns(int arr[][]) {

        int left = 0;
        int right = arr[0].length - 1;

        while (left < right) {

            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }

        return arr;
    }

    public static void printArray(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
