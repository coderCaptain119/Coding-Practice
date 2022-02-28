import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){

            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextLong();
            }

            int index = findFloor(arr,n,x);

            System.out.println(index);
            t--;

        }
    }

    private static int findFloor(long[] arr, int n, long key){

        if(key < arr[0]){
            return -1;
        }
        if(key > arr[n-1]){
            return n-1;
        }

        int low = 0;
        int high = n-1;
        int mid = 0, ans = 0;
        while(low <= high){

            mid = low + (high - low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid - 1;
            }

        }

        return ans;

    }
}