import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0,sum=0,product=1;
        int Arr[] = new int[n];
        for(i=0;i<n;i++)
            Arr[i] = sc.nextInt();
        for(i=0;i<n;i++){
            if((i+1)%2==0)
                sum += Arr[i];
            else
                product *= Arr[i];
        }
        System.out.println(sum+" "+product);
        // Your code here
    }
}