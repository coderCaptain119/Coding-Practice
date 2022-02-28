import java.util.Scanner;
import java.util.Stack;

class Pair_Hate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else{
                if (stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }
}