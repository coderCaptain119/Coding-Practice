import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[] s1 = new int[26];
        int[] s2 = new int[26];
        for(int i=0;i<str1.length();i++){
            s1[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            s2[str2.charAt(i)-'a']++;
        }
        int sum = 0;
        for(int i=0;i<26;i++){
            sum += (Math.abs(s1[i]-s2[i]));
        }
        switch(sum%6){
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Love");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            case 5:
                System.out.println("Enemy");
                break;
            case 0:
                System.out.println("Siblings");
                break;
        }
    }
}