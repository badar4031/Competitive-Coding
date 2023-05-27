public class BruteForce
{
    public static int maxSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                currSum=0;
            }
        }
        return maxSum;
    }
	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		System.out.println("Max SubArray Sum = "+maxSubarraySum(arr));
	}
}
