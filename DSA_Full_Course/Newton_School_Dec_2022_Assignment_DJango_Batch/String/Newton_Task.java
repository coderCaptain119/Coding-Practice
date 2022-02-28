import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int arr[] = {1,1,1,1,1,1};
        long min = 1;

        int i = 0;
        while(min < n){
            min = ( min / arr[i] ) * ( arr[i] + 1 );
            arr[i] += 1;
            i++;
            if(i == 6){
                i = 0;
            }
        }

        long sum=0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
        }

        System.out.print(sum);
    }
}