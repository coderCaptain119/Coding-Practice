import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        int[][] chessBoard = new int[n][n];
        for(int i=0; i<n; i++){
            for (int j=0;j<n;j++){
                chessBoard[i][j] = sc.nextInt();
            }
        }

        int sumWhite = 0;
        int sumBlack = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2 == 0 && j%2 == 0){
                    if(chessBoard[i][j] == 1)
                        sumWhite++;
                    else
                        sumBlack++;
                }
                else if(i%2 == 0 && j%2 != 0){
                    if(chessBoard[i][j] == 1)
                        sumBlack++;
                    else
                        sumWhite++;
                }
                else if(i%2 != 0 && j%2 == 0){
                    if(chessBoard[i][j] == 1)
                        sumBlack++;
                    else
                        sumWhite++;
                }
                else{
                    if(chessBoard[i][j] == 1)
                        sumWhite++;
                    else
                        sumBlack++;
                }
            }
        }
        if(sumWhite > sumBlack){
            System.out.println(sumBlack);
        }
        else{
            System.out.println(sumWhite);
        }
    }
}