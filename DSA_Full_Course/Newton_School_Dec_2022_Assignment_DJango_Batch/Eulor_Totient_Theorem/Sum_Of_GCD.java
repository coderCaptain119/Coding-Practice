import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){

            int x = sc.nextInt();

            f(x);

            t--;
        }
    }
    private static void f(int x){
        int result = 0;
        for(int i = 1; i*i <= x; i++){

            if(x%i == 0){

                int div1 = i;
                int div2 = x/i;

                result += div1*gcdCount(div1, x);
                if(div1 != div2){
                    result += div2*gcdCount(div2, x);
                }

            }

        }

        System.out.println(result);
    }
    private static int gcdCount(int div, int n){
        int num = n/div;
        int result = num;

        for(int i=2; i*i <= num; i++){

            if(num%i ==0){
                while(num%i ==0){
                    num /= i;
                }
                result -= result/i;
            }

        }
        if(num > 1){
            result -= result/num;
        }

        return result;

    }
}