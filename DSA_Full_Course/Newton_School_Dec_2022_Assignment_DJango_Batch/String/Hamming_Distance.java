import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = new String();
        boolean flag = true;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)>'a') {
                r = s.substring(0,i)+'a'+s.substring(i+1);
                flag = false;
                break;
            }
        }
        if(flag){
            r = s.substring(0,s.length()-1)+'b';
        }
        System.out.println(r);
    }
}