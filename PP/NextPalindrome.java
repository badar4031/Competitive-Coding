/***********************************************************************************************************************
Consider a number N, find the smallest number greater than N. Such that its decimal repersentation without leading
zeroes reads the same from forward and backward.
input:- 123
output:- 131
***********************************************************************************************************************/
import java.io.*;
import java.util.*;
import java.lang.Math;
class Solution {
    public static boolean checkPalindrome(int n){
        int temp=n;  
        int r,sum=0;
      while(n>0){    
           r=n%10;  //getting remainder  
           sum=(sum*10)+r;    
           n=n/10;    
      }    
      if(temp==sum)
          return true;
        else
            return false;
    }
    public static int getNextPalindrome(int N){
        if(N/10==0){
            return N+1;
        }
        for(int i=N;;i++){
            if(checkPalindrome(i))
                return i;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int result;
        result = getNextPalindrome(N);
        System.out.print(result);
        return ;
    }
}
