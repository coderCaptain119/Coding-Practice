import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[][] Arr = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arr[0][0]*Arr[1][1] - Arr[0][1]*Arr[1][0]);
    }
}