import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        int count=0;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
        System.out.println(count);
    }
}