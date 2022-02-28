import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        if(n%2 != 0){
            System.out.println(x[n/2]+" "+y[n/2]);
        }
        else{
            System.out.println(x[(int)Math.ceil((n/2)-1)]+" "+y[(int)Math.ceil((n/2)-1)]);
        }
    }
}