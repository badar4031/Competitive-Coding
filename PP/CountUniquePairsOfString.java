/******************************************************************************

   Consider a non-empty array inarr containing unique strings of lower case 
   alphabets. Identify and print outnum, the number of unique pairs from inarr
   such that:
        ->All unique alphabets present in one string of the pair must be present 
         in the other string of the pair and however need not to be vice versa.
         
        -> If no such pairs can be identified by 0.
        
        ->Input = [similar,ground,heaven,hell,earth,liar,shelf]   :o/p- 2
        ->Input = [similar,ground,heaven,help,earth,lifar,shelf]

*******************************************************************************/

import java.util.*;
public class Main
{
    public static boolean containsAll(String str1,String str2){
        Set<Character> s = new HashSet<Character>();
       // System.out.println(str1+"   "+str2);
        for(int i=0;i<str1.length();i++){
            s.add(str1.charAt(i));
        }
        //System.out.println(s);
        for(int i=0;i<str2.length();i++){
            if(!s.contains(str2.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static int countUniquePairs(String input){
        String str[] = input.split(",");
        int n = str.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(i!=j){
                    if(containsAll(str[i],str[j]))
                        c++;   
                }
            }
        }
        c = (c != 0) ? c :-1;
        return c;
    }
	public static void main(String[] args) {
	    String input = "similar,ground,heaven,hell,earth,liar,shelf";
		System.out.println(countUniquePairs(input));
	}
}
