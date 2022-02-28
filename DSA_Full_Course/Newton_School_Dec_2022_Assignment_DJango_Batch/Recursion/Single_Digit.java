import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(singleDigit(n));

    }
    private static int sumDigit(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + sumDigit(num/10);
    }
    private static int singleDigit(int num){
        num = sumDigit(num);
        if(num > 9){
            num = singleDigit(num);
        }
        return num;
    }
}