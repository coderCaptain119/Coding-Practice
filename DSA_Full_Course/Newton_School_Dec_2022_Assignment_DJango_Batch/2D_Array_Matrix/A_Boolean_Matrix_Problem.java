import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t>0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            String[] str = new String[m];
            for(int i=0; i<m; i++){
                str[i] = sc.nextLine();
                if(str[i].contains("1")){
                    str[i] = str[i].replace('0','1');
                }
            }
            for(int i=0;i<m;i++){
                System.out.println(str[i]);
            }
            t--;
        }
    }
}