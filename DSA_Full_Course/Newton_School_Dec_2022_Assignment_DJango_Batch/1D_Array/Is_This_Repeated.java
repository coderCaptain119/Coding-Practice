import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int count=1;
        for(int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        for(int j=0,k=1;k<n;j++,k++){
            if(A[j]==A[k])
                count++;
            else
                count=1;
            if(count==3)
                break;
        }
        if(count==3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // Your code here
    }
}