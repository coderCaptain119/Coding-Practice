import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        boolean flag = true;
        int count = 0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(flag){
                    count += x;
                    flag = false;
                }
                else{
                    flag = true;
                }
            }
        }
        System.out.println(count);
    }
}