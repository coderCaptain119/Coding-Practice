import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] Arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += Arr[i][i];
        System.out.print(sum+" ");

        sum = 0;
        for(int i=0,j=n-1;i<n;i++,j--){
            sum += Arr[i][j];
        }
        System.out.print(sum);
    }
}