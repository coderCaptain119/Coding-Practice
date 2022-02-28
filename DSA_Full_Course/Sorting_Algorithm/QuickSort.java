package NewtonialHard;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 5, 45, 7, 10};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
    private static void quickSort(int[] arr, int low, int high){
        if( low < high) {
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low, pivot_index - 1);
            quickSort(arr, pivot_index + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        int j = low;
        while(j < high){
            if(arr[j] < pivot){
                swap(arr, i+1 ,j);
                i++;
            }
            j++;
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    // Time Complexity = 1 * n * n = O(n2) - Worst Case
    // Time Complexity =1 * n * log(n) = O(nlog(n)) - Average Case
    // Space Complexity = O(1)
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void print(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
