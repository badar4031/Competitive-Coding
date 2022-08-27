/******************************************************************************
    Somar is the instructor of programming at HIAST. He wants to check his student’s
    ability at programming so he gives them an easy task. He gives them an array consists 
    of n distinct elements and asks them how many pairs are in the array that the sum of 
    elements of the pair is equal to x.

Input Format
The first line contains an integer, x, denoting the sum .
The next line contains an integer, n, denoting the number of elements in a.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing ai.
 

Constraints
1 <= x <= 10^5
1 <= n <= 10^6
0 <= a[i] <= 2*10^9

Sample Input:-
13
6
2
4
9
8
6
1

Sample Output:-
13
Explanation:-
	We only have 9+4=13, and that's the only pair the sums to 13.

*******************************************************************************/

import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    public static int easytask(int sum,int n,int[] arr){
        
        HashMap<Integer,
                Integer> mp = new HashMap<Integer,
                                          Integer>();
        int c =0;
     
        // Traverse through all elements
        for(int i = 0; i < n; i++)
        {
            // Search if a pair can be formed with
            // arr[i].
            int rem = sum - arr[i];
            if (mp.containsKey(rem))
            {
                int count = mp.get(rem);
                for(int j = 0; j < count; j++){
                    
                    c++;
                }
            }
            
            else
            {
                mp.put(arr[i], 1);
            }
        }
        //System.out.print(mp);
        return c;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        x=scan.nextInt();
        int n;
        n=scan.nextInt();
        int[] a = new int[n];
        for(int j=0;j<n;j++){
            a[j]=scan.nextInt();
        }
        int result;
        result = easytask(x,n,a);
        System.out.print(result);
        return ;
    }
}
