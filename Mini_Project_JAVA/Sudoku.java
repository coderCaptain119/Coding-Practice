import java.util.Scanner;

public class Sudoku{
    private static final int GRID_SIZE = 9;
    private static int[][] board = new int[GRID_SIZE][GRID_SIZE];

    private static void giveInput(){
        System.out.println("***************************");
        System.out.println("Welcome To World of SUDOKU");
        System.out.println("***************************");
        System.out.println("Enter 0 in place of Blank");
        System.out.println("Enter number beetween 0 to 9");
        System.out.println("for default board input...");
        System.out.println("***************************");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        displayBoard();
        System.out.println();
        System.out.println("***************************");
        System.out.println(" (: OUTPUT :)");
        System.out.println("***************************");
        System.out.println();
    }
    private static void displayBoard(){
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i%3 == 0 && i != 0) {
                System.out.println("-----------------------");
            }
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j%3 == 0 && j != 0) {
                    System.out.print(" | ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean isPresentInColumn(int column, int number){
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number)
                return true;
        }
        return false;
    }
    private static boolean isPresentInRow(int row, int number){
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number)
            return true;
        }
        return false;
    }
    private static boolean isPresentInGride(int row, int column, int number){
        int currGridRow = row - row%3;
        int currGridColumn = column - column%3;

        for (int i = currGridRow; i < currGridRow + 3; i++) {
            for (int j = currGridColumn; j < currGridColumn + 3; j++) {
                if (board[i][j] == number)
                    return true;
            }
        }
        return false;
    }
    private static boolean isValidPlace(int row, int column, int number){
        return !isPresentInGride(row, column, number) && !isPresentInRow(row, number) && !isPresentInColumn(column, number);
    }
    private static boolean sudokuSolver(){
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (board[i][j] == 0) {
                    for (int k = 1; k <= GRID_SIZE; k++) {
                        if (isValidPlace(i, j, k)) {
                            board[i][j] = k;
                            
                            if (sudokuSolver())
                                return true;
                            else
                                board[i][j] = 0;

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        giveInput();
        if (sudokuSolver()) {
            displayBoard();
        }
        else {
            System.out.println("Given board is InValid :(");
        }
    }
}