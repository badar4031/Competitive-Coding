public class PrefixSum
{
    public static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int n = arr.length;
        int prefix[] = new int[n];
        
        prefix[0] = arr[0];
        //Calculate prefix array
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];    
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<=j;k++){
                    currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
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
