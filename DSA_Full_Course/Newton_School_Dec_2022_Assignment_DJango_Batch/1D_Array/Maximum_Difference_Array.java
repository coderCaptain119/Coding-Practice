import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Arr = new int[n];
        for(int i=0;i<n;i++)
            Arr[i] = sc.nextInt();

        int[] leftMin = new int[n];
        leftMin[0] = Arr[0];
        for(int i=1;i<n;i++)
            leftMin[i] = Math.min(Arr[i],leftMin[i-1]);

        int[] rightMax = new int[n];
        rightMax[n-1] = Arr[n-1];
        for(int i=n-2;i>=0;i--)
            rightMax[i] = Math.max(Arr[i],rightMax[i+1]);

        int i=0,j=0;
        int ans = -1;
        while(i<n && j<n){
            if(rightMax[j] > leftMin[i]){
                ans = Math.max(ans, j-i);
                j++;
            }
            else{
                i++;
            }
        }

        System.out.println(ans);
    }
}