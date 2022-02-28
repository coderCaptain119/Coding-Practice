import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] Arr  = new int[rows][columns];
        int[] sum = new int[rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                Arr[i][j] = sc.nextInt();
                sum[i] += Arr[i][j];
            }
        }
        int max=0,ans=0;
        for(int i=0;i<rows;i++){
            if(sum[i]>max){
                ans = i;
                max = sum[i];
            }
        }
        System.out.println(ans);
    }
}