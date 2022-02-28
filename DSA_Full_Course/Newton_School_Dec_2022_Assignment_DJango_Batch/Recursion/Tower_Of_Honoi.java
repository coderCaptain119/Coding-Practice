import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        towerOfHonoi(n,'A','C','B');
    }
    private static void towerOfHonoi(int disk, char from, char dest, char temp){
        if(disk == 0){
            return;
        }
        towerOfHonoi(disk-1, from, temp, dest);
        System.out.println(disk +":"+from+"->"+dest);
        towerOfHonoi(disk-1, temp, dest, from);
    }
}