import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] Arr = new int[n][n];
        int[][] ArrTrans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arr[i][j] = sc.nextInt();
                ArrTrans[j][i] = Arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ArrTrans[i][j]+" ");
            }
            System.out.println();
        }
    }
}