/******************************************************************************
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note : Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00 PM on 12-hour clock and 12:00:00 on 24-hour clock.

Input format:

Read the time in the format HH:MM:SSAM/PM from the standard input stream

Output format:

Print the military time to the standard output stream

Samle Input = 11:21:30PM
Sample output = 23:21:30

*******************************************************************************/



import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

class myCode
{
    public static String convert24Hour(String input)
    {
        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = null;
        String output ="";
        try{
            time = inputFormat.parse(input);
            output = outputFormat.format(time);
        }
        catch(ParseException e){
            System.out.print(e);
        }
        return output;
        
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        
        System.out.println(convert24Hour(inputString));
    }
}
