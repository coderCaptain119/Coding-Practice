import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.contains(" "))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}