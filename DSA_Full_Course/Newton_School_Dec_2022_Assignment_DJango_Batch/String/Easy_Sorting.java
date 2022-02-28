import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String[] str1 = new String[5];
        for(int i=0;i<5;i++){
            str1[i] = sc.next();
        }
        String[] str2 = sortStrings(str1);
        for(int i=0;i<5;i++){
            System.out.print(str2[i]+" ");
        }
    }
    public static String[] sortStrings(String[] s){
        String temp = new String();
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(s[i].compareTo(s[j])>0){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
}