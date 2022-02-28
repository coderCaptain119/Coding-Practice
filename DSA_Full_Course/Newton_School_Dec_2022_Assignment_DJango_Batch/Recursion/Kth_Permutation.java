import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = i+1;
        }
        // finding permutations
        while(k>1) {
            for (int i = n - 1; i > 0; i--) {
                if (arr[i - 1] < arr[i]) {
                    int j = n-1;
                    while(j>= i) {
                        if(arr[j] > arr[i-1]) {
                            swap(arr, i - 1, j);
                            break;
                        }
                        j--;
                    }
                    reverse(arr, i, n - 1);
                    break;
                }
            }
            k--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private static void reverse(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        swap(arr,low,high);
        reverse(arr, low+1,high-1);
    }
}