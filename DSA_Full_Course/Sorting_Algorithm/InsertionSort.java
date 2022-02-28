package NewtonialHard;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 5, 45, 7, 10};
        insertionSort(arr);
        print(arr);
    }
    private static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int pivot = arr[i];
            int j = i - 1;
            while( j>=0 && arr[j] > pivot){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = pivot;
        }
    }
    // Time Complexity = O(n2)
    // Space Complexity = O(1)
    private static void print(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}
