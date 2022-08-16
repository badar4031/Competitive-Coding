/*You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.*/
/*
Example 1 : Consider the following 3 activities sorted by
by finish time.
     start[]  =  {10, 12, 20};
     finish[] =  {20, 25, 30};
A person can perform at most two activities. The 
maximum set of activities that can be executed 
is {0, 2} [ These are indexes in start[] and 
finish[] ]

Example 2 : Consider the following 6 activities 
sorted by finish time.
     start[]  =  {1, 3, 0, 5, 8, 5};
     finish[] =  {2, 4, 6, 7, 9, 9};
A person can perform at most four activities. The 
maximum set of activities that can be executed 
is {0, 1, 3, 4} [ These are indexes in start[] and 
finish[] ]
*/

import java.io.*;
import java.util.*;
class Activity
{
  int start, finish;
 
  // Constructor
  public Activity(int start, int finish)
  {
    this.start = start;
    this.finish = finish;
  }
}
class Compare{
    // A utility function that is used for sorting
  // activities according to finish time
  static void compare(Activity arr[],int n){
      Arrays.sort(arr,new Comparator<Activity>(){
          @Override
            public int compare(Activity s1, Activity s2){
                return s1.finish - s2.finish;
            }
      });
  }
}

class HelloWorld {
     // Returns count of the maximum set of activities that
  // can
  // be done by a single person, one at a time.
  static void printMaxActivities(Activity arr[], int n)
  {
    // Sort jobs according to finish time
     Arrays.sort(arr,new Comparator<Activity>(){
          @Override
            public int compare(Activity s1, Activity s2){
                return s1.finish - s2.finish;
            }
      });
    System.out.println(
      "Following activities are selected :");
 
    // The first activity always gets selected
    int i = 0;
    System.out.print("(" + arr[i].start + ", "
                     + arr[i].finish + "), ");
 
    // Consider rest of the activities
    for (int j = 1; j < n; j++)
    {
 
      // If this activity has start time greater than
      // or equal to the finish time of previously
      // selected activity, then select it
      if (arr[j].start >= arr[i].finish)
      {
        System.out.print("(" + arr[j].start + ", "
                         + arr[j].finish + "), ");
        i = j;
      }
    }
  }
 
  // Driver code
  public static void main(String[] args)
  {
 
    int n = 6;
    Activity arr[] = new Activity[n];
    arr[0] = new Activity(5, 9);
    arr[1] = new Activity(1, 2);
    arr[2] = new Activity(3, 4);
    arr[3] = new Activity(0, 6);
    arr[4] = new Activity(5, 7);
    arr[5] = new Activity(8, 9);
 
    printMaxActivities(arr, n);
  }
}
