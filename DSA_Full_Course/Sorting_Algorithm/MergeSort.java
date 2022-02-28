package NewtonialHard;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 5, 45, 7, 10};
        mergeSort(arr, 0 ,arr.length-1);
        print(arr);
    }
    private static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = low + (high -low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr,mid+1, high);
            merge(arr, low , mid , high);
        }
    }
    // Time Complexity = log(n) * (2n) = O(nlog(n))
    // Space Complexity = n/2 + n/2 + .... +1 = O(n)
    private static void merge(int[] arr, int low, int mid, int high){
        int m = mid - low + 1;
        int n = high - mid;
        int[] left = new int[m];
        int[] right = new int[n];

        int i = 0;
        int j = low;
        while( i < m){
            left[i] = arr[j];
            i++;
            j++;
        }
//        for(int i = 0; i < m; i++){
//            left[i] = arr[low + i];
//        }

        i = 0;
        j = mid+1;
        while( i < n){
            right[i] = arr[j];
            i++;
            j++;
        }
//        for(int j = 0; j < j; j++){
//            right[j] = arr[mid + j + 1];
//        }

        i = 0;
        j = 0;
        int k = low;
        while( i < m && j < n){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while( i < m){
            arr[k] = left[i];
            i++;
            k++;
        }
        while( j < n){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    private static void print(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
