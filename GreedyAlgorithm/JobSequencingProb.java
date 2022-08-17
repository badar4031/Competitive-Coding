/*
Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. How to maximize total profit if only one job can be scheduled at a time.
*/

/*
    Input: Four Jobs with following 
deadlines and profits
JobID  Deadline  Profit
  a      4        20   
  b      1        10
  c      1        40  
  d      1        30
Output: Following is maximum 
profit sequence of jobs
        c, a   


Input:  Five Jobs with following
deadlines and profits
JobID   Deadline  Profit
  a       2        100
  b       1        19
  c       2        27
  d       1        25
  e       3        15
Output: Following is maximum 
profit sequence of jobs
        c, a, e
*/
import java.util.*;
class Job{
    char jobName;
    int deadline;
    int profit;
    
    public Job(char jobName, int deadline, int profit){
        this.jobName = jobName;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class HelloWorld {
    public static void printJobScheduling(ArrayList<Job> arr){
        int n = arr.size();
        ArrayList<Job> res = new ArrayList<Job>();
        Collections.sort(arr,(j1,j2)->{
            return j2.profit-j1.profit;
        });
        Map<Integer,Integer> resMap = new HashMap<Integer,Integer>();
        for (Job job : arr){
            resMap.put(job.deadline,-1);
        }
        for (Job job : arr){
            if(resMap.containsKey(job.deadline) && resMap.get(job.deadline)==-1){
                resMap.put(job.deadline,job.profit);
                res.add(job);
            }
        }System.out.println();
        for (Job job : res) {
            System.out.println(job.jobName + " "+job.profit + " "+job.deadline + " ");
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        ArrayList<Job> arr = new ArrayList<Job>();
 
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        // Function call
        System.out.println("Following is maximum "
                           + "profit sequence of jobs");
 
        // Calling function
        printJobScheduling(arr);
    }
}
