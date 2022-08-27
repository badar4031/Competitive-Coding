/******************************************************************************
 
    Given a start time S and an end time E in 24 HR format (HH:MM), write a program 
    to print the number of times the minute and the hour hand will be overlapping in 
    between the given duration.

Input format:

The first line contains the start time in the format HH:MM

The second line contains the end time in the format HH:MM

Read the input from the standard input stream

Output format:

Print the output to the standard output stream

Sample Input :-
00:00
23:59

Sample output:-
22

*******************************************************************************/



import java.io.*;
import java.time.*;
import java.util.*;
class myCode
{
    public static long overlappingClockHand(String inp1,String inp2){
        LocalTime time1 = LocalTime.parse(inp1);
        LocalTime time2 = LocalTime.parse(inp2);
        Duration duration = Duration.between(time1, time2);
        long diff = duration.toMinutes();
        long count = diff/65;
       // System.out.println(count+"  "+1440/65+"  "+duration.toMinutes());
        return count;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String inp1=s.next();
        String inp2 =s.next();
        System.out.println(overlappingClockHand(inp1,inp2));
    }
}
