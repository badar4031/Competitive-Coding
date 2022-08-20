//   [{{()}}]       ->true
//   ([){}]         ->false

import java.util.*;

class BalancingBracket{
    public boolean checkBalance(String str){
        char ob=' ',cb=' ';
        Stack<Character> s = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char input = str.charAt(i);
            if(input=='[' || input=='{' || input=='('){
                ob = input;
                s.push(input);
                //System.out.println(s);
            }
            else if(input==']' || input=='}' || input==')'){
                cb = input;
                if(input == ']' && ob == '['){
                    s.pop();
                    if(s.empty())
                        break;
                    ob = s.peek();
                }
                else if(input == '}' && ob == '{'){
                    s.pop();
                    if(s.empty())
                        break;
                    ob = s.peek();
                }
                else if(input == ')' && ob == '('){
                    s.pop();
                    if(s.empty())
                        break;
                    ob = s.peek();
                }
            }
            //System.out.println(s);
        }
        if(ob == '[' && cb == ']')
            return true;
        else if(ob == '{' && cb == '}')
            return true;
        else if(ob == '{' && cb == '}')
            return true;
        return false;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        String input = "[([]){}[]{]";
        BalancingBracket b = new BalancingBracket();
        boolean res = b.checkBalance(input);
        System.out.println(res);
    }
}
