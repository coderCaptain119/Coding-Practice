package NewtonialHard;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 5, 45, 7, 10};
        selectionSort(arr);
        print(arr);


    }
    private static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    // Time Complexity = O(n2)
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
