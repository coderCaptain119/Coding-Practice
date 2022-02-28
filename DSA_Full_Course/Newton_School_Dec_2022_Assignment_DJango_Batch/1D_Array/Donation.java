import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int minimumDonation = 0;
        long totalDonation = 0;
        for(int i=0;i<n;i++){
            int extra = 0;
            if(minimumDonation<=a[i]){
                minimumDonation = a[i];
            }
            else{
                extra = minimumDonation - a[i];
                a[i] = minimumDonation;
            }
            System.out.print(extra +" ");
            totalDonation += a[i];
        }
        System.out.println();
        System.out.println(totalDonation);
    }
}