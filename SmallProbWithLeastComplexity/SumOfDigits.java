import java.io.*;
 
class SumOfDigits {
 
    /* Function to get sum of digits */
    static int sumDigits(int no)
    {
        if(no == 0){
          return 0 ;
        }
 
        return (no % 10) + sumDigits(no / 10) ;
     }
 
    // Driver code
    public static void main(String[] args)
    {
        System.out.println(sumDigits(687));
    }
}
