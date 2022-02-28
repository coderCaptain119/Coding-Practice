import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr,n);
    }
    private static void selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}