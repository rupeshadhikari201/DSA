
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,7,1,6};
        int start = 0;
        int end = arr.length-1;
        sort(arr,start,end);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void sort(int[] arr, int start, int end){

        if(start<end){
            
            int mid = start + (end-start)/2;

            sort(arr,start, mid);
            sort(arr,mid+1,end);

            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        // 0 1 2 3 --> mid = 3/2=1 --> l1 = mid-start+1
        // get the length of the partitioned array
        int l1 = mid-start+1;
        int l2 = end-mid;

        // create an array of that size
        int[] partition1 = new int[l1];
        int[] partition2 = new int[l2];

        // fill the partitioned array
        for(int i =0; i<l1; i++){
            partition1[i]=arr[start+i];
        }
        for(int j=0; j<l2; j++){
            partition2[j]=arr[mid+1+j];
        }

        // merge the partitioned array
        int i=0;
        int j=0;
        int k=start;
        while(i < l1 && j<l2){
            if(partition1[i] <= partition2[j]){
                arr[k]=partition1[i];
                i++;
            }else{
                arr[k]=partition2[j];
                j++;
            }
            k++;
        }

        // if partition 1 is larger
        while(i<l1){
            arr[k] = partition1[i];
            i++;
            k++;
        }
        // if partition 2 is larger
        while(j<l2){
            arr[k] = partition2[j];
            j++;
            k++;
        }
    }
}
