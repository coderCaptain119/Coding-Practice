import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int i=0;
        for(i=0;i<n;i++)
            A[i] = sc.nextInt();
        int B[] = new int[n];
        for(i=0;i<n;i++)
            B[i]=A[A[i]];
        for(i=0;i<n;i++)
            System.out.print(B[i]+" ");	              // Your code here
    }
}