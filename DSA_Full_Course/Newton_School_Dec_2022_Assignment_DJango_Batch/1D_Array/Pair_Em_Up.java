import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        Arrays.sort(Arr);
        int max=1;
        for(int i=0; i<n; i++){
            int value=Arr[i]+Arr[n-i-1];
            if(max<value){
                max=value;
            }
        }

        System.out.println(max);
    }
}