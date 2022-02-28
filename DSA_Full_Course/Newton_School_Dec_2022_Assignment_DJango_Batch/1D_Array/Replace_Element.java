import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int Arr1[] = new int[n];
        int Arr2[] = new int[n];
        for(i=0;i<n;i++)
            Arr1[i] = sc.nextInt();
        for(i=0;i<n;i++){
            if(i==0)
                Arr2[i]=Arr1[i]*Arr1[i+1];
            else if(i==(n-1))
                Arr2[i]=Arr1[i]*Arr1[i-1];
            else
                Arr2[i]=Arr1[i-1]*Arr1[i+1];
        }
        for(i=0;i<n;i++)
            System.out.print(Arr2[i]+" ");
        // Your code here
    }
}