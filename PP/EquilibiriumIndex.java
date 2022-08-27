/******************************************************************************
 
   Given an array of integers, find the equilibrium index of the array.

In case of an array, A, its equilibrium index, i, is such that

(A[0]+A[1]+……+A[i-1]) =  (A[i+1]+A[i+2]+……..+A[n-1]) where 0 < i < n-1

Exception cases:

0 should be considered as the equilibrium index, if A[1]+A[2]+…….+A[n-1] = 0
n-1 should be considered as the equilibrium index, if A[0]+A[1]+…….+A[n-2] = 0
-1 should be considered as the equilibrium index, if the condition for equilibrium
index is not found to be true for any acceptable value of i.
Input format:

Read the array of elements from the standard input stream

Output format:

Print the equilibrium index to the standard output stream

Sample input = 3,-4, 2, -1,-3, 2, 1
Sample output = 2

Explanation= For the given input, the equilibrium index is 2 as sum of the elements
to the left of index 2 is -1 and right of index 2 is also -1

*******************************************************************************/




import java.io.*;
import java.util.*;
class myCode
{
    public static int equilibirium(String input){
        String str[] = input.split(",");
        int n = str.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            str[i] = str[i].replaceAll(" ","");
            arr[i] = Integer.parseInt(str[i]);
            //System.out.println(arr[i]);
        }
        int sumLeft=0;
        int sumRight=0;
        for(int i=1;i<n-1;i++){
            sumLeft+=arr[i];
        }
        if(sumLeft == 0)
            return 0;
        sumLeft =0;
        for(int i=0;i<n-2;i++){
            sumLeft+=arr[i];
        }
        if(sumLeft == 0)
            return 0;
        for(int i=0;i<n;i++){
            sumLeft=0;
            sumRight=0;
            for(int j=0;j<i;j++){
                sumLeft+=arr[j];
            }
            for(int k=i+1;k<n;k++){
                sumRight+=arr[k];
            }
            if(sumLeft==sumRight)
                return i;
        }
        return -1;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
       // int arr[] = {3,-4,2,-1,-3,2,1};
        System.out.println(equilibirium(inputString));
    }
}
