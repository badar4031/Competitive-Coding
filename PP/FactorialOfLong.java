/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.math.BigInteger;
import java.util.*;
public class Main
{
public static void main(String[] args) {
System.out.println("Hello World");
Solution s = new Solution();
s.factorial(10);
}
}
class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        BigInteger fact ;
        fact = BigInteger.valueOf(1);
        ArrayList<Integer> a  = new ArrayList<>();
        for(int i =1;i<=N;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
        return null;
    }
}
