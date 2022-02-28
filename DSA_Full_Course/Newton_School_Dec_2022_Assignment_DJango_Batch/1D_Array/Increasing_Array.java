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

        for(int i=0;i<n;i++){
            Arr[i] = smallestDivisor(Arr,i);
        }
        boolean flag = true;
        for(int i=1;i<n;i++){
            if(Arr[i] <= Arr[i-1]){
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("YES");
    }
    public static int smallestDivisor(int[] Arr,int index){
        if(index == 0){
            return 1;
        }
        else{
            for(int i = Arr[index-1]+1;i<=Arr[index];i++){
                if(Arr[index]%i == 0)
                    return i;
            }
            return 0;
        }
    }
}