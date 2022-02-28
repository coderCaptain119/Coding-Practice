import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(midGuardSurvivor(n,k));

            t--;
        }
    }
    private static int midGuardSurvivor(int n, int k){
        if(n == 1){
            return 1;
        }
        return (midGuardSurvivor(n-1,k) + k - 1)%n + 1;
    }
}