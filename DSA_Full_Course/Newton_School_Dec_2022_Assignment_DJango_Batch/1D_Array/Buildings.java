import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int H[]= new int[n];
        for(int i=0;i<n;i++)
            H[i]=sc.nextInt();
        int count=1;
        for(int i=1;i<n;i++){
            boolean flag = true;
            for(int j=i-1;j>=0;j--){
                if(H[j]>=H[i]){
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        System.out.println(count);
    }
}