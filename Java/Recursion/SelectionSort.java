package Recursion;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = {5,3,2,8,1};
        System.out.print("The array before Selection Sort is : ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        selectionSort(arr,0, arr.length);
        System.out.print("The array after  Selection Sort is : ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    // func to get the minimum index (index of element with the smallest value)
    public static int minIndex(int arr[], int start, int end){

        int max = Integer.MAX_VALUE;
        int min_index = -1;

        for(int i =start; i<end; i++){

            if(max > arr[i]){
                max = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public  static void selectionSort(int arr[], int start, int end){

        // 1. continue till only while start >= end
        if(start >= end) {
            return;
        }
        int min_index;
        int temp;

        // 2. find the min index
        min_index = minIndex(arr, start, end);

        // 3. swap min_index with start
        temp = arr[start];
        arr[start] = arr[min_index];
        arr[min_index] = temp;

        // 4. increase the start by 1
        selectionSort(arr,start+1, end);


    }
}
