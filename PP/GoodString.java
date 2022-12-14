/******************************************************************************
    Jon is very fond of strings. (Or so he thinks!) But, he does not like strings which 
    have same consecutive letters. No one has any idea why it is so. He calls these strings
    as Bad strings. So, Good strings are the strings which do not have same consecutive letters. 
    Now, the problem is quite simple. Given a string S, you need to convert it into a Good String.

You simply need to perform one operation - if there are two same consecutive letters, delete one of them.

Input:
The first line contains an integer T, denoting the number of test cases.
The next T lines contains the test cases consisting of a string S, which consists of only lower case letters.

Output:
For each test case, print the answer to the given problem.

Constraints:
1 <= T <= 10
1 <= |S| <= 30


Sample Input:-
4
abb
aaab
ababa
aabbaa

Sample Output:- 
ab
ab
ababa
aba

Explanation:-
In the first case, S = "abb". Since, S has same consecutive letter 'b' we will delete one of them. 
So, the good string will be "ab".
In the second case, S = "aaab" and since S has same consecutive letter 'a' we will delete them one by one.
aaab -> aab -> ab. So, the good string will be "ab".
In the third case, S = "ababa" and S has no same consecutive letter. So, the good string will be "ababa"
In the fourth case, S = "aabbaa".S has the following same consecutive letter :
'a' in the beginning,
'b',
'a' at the end

We will delete them one by one. aabbaa -> abbaa -> abaa -> aba. So, the good string will be "aba".

*******************************************************************************/



import java.io.*;
import java.util.*;
class myCode
{
    public static String goodString(String str){
        List<Character> c = new ArrayList<Character>();
        c.add(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                c.add(str.charAt(i));
            }
        }
        StringBuffer res = new StringBuffer("");
        for(int i=0;i<c.size();i++){
            res.append(c.get(i));
        }
        //System.out.println(c);
        return res.toString();
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            String input = s.next();
            System.out.println(goodString(input));
        }
        //String input = "aaab";
        
    }
}
