package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = { 8, 5, 7, 3, 2 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        BubbleSortImp(arr);

        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void BubbleSortImp(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
