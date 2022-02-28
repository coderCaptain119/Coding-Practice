import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] Matric = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Matric[i][j] = sc.nextInt();
            }
        }
        int sumBlack = 0;
        int sumWhilte = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2 == 0){
                    if(j%2 ==0)
                        sumBlack += Matric[i][j];
                    else
                        sumWhilte += Matric[i][j];
                }
                else{
                    if(j%2 ==0)
                        sumWhilte += Matric[i][j];
                    else
                        sumBlack += Matric[i][j];
                }
            }
        }
        System.out.println(sumBlack);
        System.out.println(sumWhilte);
    }
}