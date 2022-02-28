import java.util.*;

public class ExcelColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(columnNumber(str, str.length()));
    }
    private static long columnNumber(String s, int n){
        long result = 0;
        int i = s.length()-1;
        while ( i >= 0){
            result += ((long)Math.pow(26, i)*((int)s.charAt(Math.abs(n-i-1)) - 64));
            i--;
        }
        return result;
    }
}
