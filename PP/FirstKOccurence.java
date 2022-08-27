/***********************************************************************************************************************************************************.
You are given a string S of length N and an integer K. You have to print only the first K occurrences of every character in the string 
(and ignore the subsequent occurrences).

Input Format:
First line contains T, number of test cases.
First line of each test case contains 2 integers N and K.
Second line of each test case contains the string S, comprising of only lowercase alphabets.
Read the inputs from the standard input stream.

Constraints:

1<=T<=100 
1<=N<=10**5 
1<=K<=10**4

Output Format:
Print the output string to the standard output  stream.

Input:-
2
8 2
ababbca
10 3
abcaacbccb

Output:-
ababc
abcaacbcb

Explanation:-
For the given input there are two test cases.
For the first test case N = 8, K=2 and S = ababbca.
As K = 2, considering the first two occurrences of the characters in the order of their occurrence, the resultant output is ababc
For the second test case N=10, K=3 and N=abcaacbccb.
As N=3, considering only the first 3 occurrences of the characters in the order of their appearance, the output is abcaacbcb

********************************************************************************************************************************************************************/



import java.io.*;
import java.util.*;

class myCode
{
    public static String printStr(String str,int n,int k){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }
           else{
               if(map.get(str.charAt(i))>=k)
                   continue;
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
               
            }
        }
         StringBuilder res = new StringBuilder("");
        
        for(int i=0;i<n;i++){
            if(map.get(str.charAt(i))>0){
                res.append(str.charAt(i));
                map.put(str.charAt(i),map.get(str.charAt(i))-1);
            }
        }
        //ystem.out.println(map);
        return res.toString();
    }
    public static void main (String[] args) throws java.lang.Exception
    { 
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
           int n=s.nextInt();
            int k =s.nextInt();
            String input =s.next(); 
            System.out.println(printStr(input,n,k));
        }
    }
}
