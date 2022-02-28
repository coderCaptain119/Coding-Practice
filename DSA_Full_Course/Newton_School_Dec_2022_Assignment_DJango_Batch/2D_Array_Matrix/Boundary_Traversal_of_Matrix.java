import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int[][] arr = new int[rows][columns];
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++)
                    arr[i][j] = sc.nextInt();
            }

            boundaryTravers(arr, rows, columns);
            System.out.println();
            t--;
        }
    }
    public static void boundaryTravers(int[][] arr, int rows, int columns){
        if(rows == 1){
            for(int j=0;j<columns;j++){
                System.out.print(arr[0][j]+" ");
            }
        }
        else if(columns == 1){
            for(int i=0;i<rows;i++){
                System.out.print(arr[i][0]+" ");
            }
        }
        else{
            for(int j=0;j<columns;j++){
                System.out.print(arr[0][j]+" ");
            }
            for(int i=1;i<rows;i++){
                System.out.print(arr[i][columns-1]+" ");
            }
            for(int j=columns-2;j>=0;j--){
                System.out.print(arr[rows-1][j]+" ");
            }
            for(int i=rows-2;i>0;i--){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
}