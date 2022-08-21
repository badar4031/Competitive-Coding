// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void print(String str){
        Stack<Integer> s = new Stack<Integer>();
        int c=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                System.out.println(c);
                s.push(c);
                c++;
            }
            else if(str.charAt(i)==')'){
                System.out.println(s.peek());
                s.pop();
             
            }
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String input = "(()a+b)*(5*(()c-d))";
        print(input);
       // System.out.println(n);
    }
}
