/************************************************************************************************************************
Given an array with N distinct elements, convert the given array to a reduced form where all elements are 
in range from 0 to N-1. The order of elements is same, i.e., 0 is placed in place of smallest element, 1 is 
placed for second smallest element, … N-1 is placed for largest element.

N = 3
Arr[] = {10, 40, 20}
Output: 0 2 1
Explanation: 10 is the least element so it
is replaced by 0. 40 is the largest
element so it is replaced by 3-1 = 2. And
20 is the 2nd smallest element so it is
replaced by 1.
************************************************************************************************************************/

// Java Program to convert an Array
// to reduced form
import java.util.*;

class CoordinateCompression.java
{
void convert(int[] arr, int n) {
        // code here
        //int o[] = new int[n];
        int temp[]= arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(temp[i],i);
        }
        for(int i =0;i<n;i++){
            arr[i]= map.get(arr[i]);
        }
       
    }

  public static void printArr(int arr[], int n)
  {
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args)
  {

    int arr[] = {10, 20, 15, 12, 11, 50};
    int n = arr.length;

    System.out.println("Given Array is ");
    printArr(arr, n);

    convert(arr , n);

    System.out.println("\n\nConverted Array is ");
    printArr(arr, n);

  }
}
