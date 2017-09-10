package geeksforgeeks.strings;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by guptaanirudh100 on 8/16/2017.
 */
public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            String pattern = p.next();
            paranthesisCheck(pattern);
            t--;
        }
    }

    private static void paranthesisCheck(String pattern) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < pattern.length(); i++) {
            char x = pattern.charAt(i);
           if(x=='{'||x=='('||x=='['){
               stack.push(x);
           }else if(!stack.isEmpty()) {
                   char ch = stack.peek();
                   if(ch=='{'&&x=='}') stack.pop();
                   else if(ch=='('&&x==')') stack.pop();
                   else if(ch=='['&&x==']') stack.pop();
                   else break;
               }else {
               stack.push(x);
               break;
           }



        }
        if (stack.isEmpty()) {
            System.out.println("balanced");
        }else {
            System.out.println("not balanced");
        }
    }
}
