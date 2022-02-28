import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            String str = sc.next();

            int count = 1, sum = 0;
            int i = 0, j = i + 1;
            while (j < str.length()) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 3) {
                    sum++;
                    count = 1;
                }
                i++;
                j++;
            }
            System.out.println(sum);
            t--;
        }
    }
}