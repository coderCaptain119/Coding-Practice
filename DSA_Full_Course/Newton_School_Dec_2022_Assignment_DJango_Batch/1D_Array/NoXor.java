import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Arr[] = new int[n];
        for(int i=0;i<n;i++)
            Arr[i] = sc.nextInt();

        long sum = 0;
        for(int i=1;i<=n;i++){
            sum += ((n-i)^Arr[i-1]);
        }

        System.out.println(sum);
    }
}