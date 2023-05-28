public class MaxProfit
{
    public static int calcMaxProfit(int arr[]){
        int n = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        int sp, bp,p;
        bp = arr[0];
        sp = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            sp = Math.max(sp,arr[i]);
            p = sp-bp;
            bp = Math.min(bp,arr[i-1]);
            maxProfit = Math.max(maxProfit,p);
        }
        return maxProfit;
    }
	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		System.out.println("Maximum profit = "+calcMaxProfit(arr));
	}
}
