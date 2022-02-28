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
        Arrays.sort(arr);
        // quickSort(arr,0,n-1);
        int i = 0;
        for(i=1;i<n;i+=2){
            System.out.print(arr[i]+" "+arr[i-1]+" ");
        }
        if(i==n){
            System.out.print(arr[n-1]);
        }

    }
    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        for(int j = i; j<high; j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,high);
        return i;
    }
    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}