package NewtonialHard;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 12, 5, 45, 7, 10};
        bubbleSort(arr);
        print(arr);


    }
    private static void bubbleSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
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
