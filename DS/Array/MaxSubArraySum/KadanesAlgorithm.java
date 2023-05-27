/******************************************************************************
    Kadanes Algorithm says if ur currSum is coming as -ve at any point instead
    of increasing -ve sum mark it as 0 and then proceed

*******************************************************************************/

public class KadanesAlgorithm
{
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum < 0)
                currSum = 0;
            if(maxSum < currSum)
                maxSum = currSum;
        }
        return maxSum;
    }
    public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		System.out.println("Max SubArray Sum = "+maxSubarraySum(arr));
	}
}
