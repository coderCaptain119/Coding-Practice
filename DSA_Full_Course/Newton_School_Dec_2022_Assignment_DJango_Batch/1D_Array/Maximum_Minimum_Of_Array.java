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
            int Arr[] = new int[n];
            for(int i=0;i<Arr.length;i++){
                Arr[i] = sc.nextInt();
            }
            int max = Arr[0], min = Arr[0];
            for(int i=1;i<n;i++){
                if(max<Arr[i])
                    max = Arr[i];
                if(min>Arr[i])
                    min = Arr[i];
            }
            System.out.println(max +" "+ min);
            t--;
        }
    }
}