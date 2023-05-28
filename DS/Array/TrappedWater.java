/******************************************************************************
    Problem:-
    Given n non-negative integers repersenting an elevation map where the width 
    of each bar is 1, compute how much water it can trap after raining
    
    We will solve this problem with the help of auxilary array.

*******************************************************************************/

public class TrappedWater
{
    public static int trappedWater (int arr[]){
        int tw = 0;
        int n = arr.length;
        int maxLeftArr[] = new int[n];
        int maxRightArr[] = new int[n];
        if(n<=2)
            return 0;
        
        //calculating maxLeftArr
        maxLeftArr[0]=arr[0];
        for(int i=1;i<n;i++){
            maxLeftArr[i] = Math.max(maxLeftArr[i-1],arr[i]);
        }
        
        //calculating maxRightArr
        maxRightArr[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            maxRightArr[i] = Math.max(maxRightArr[i+1],arr[i]);
        }
        //first and last element can't store any water
        for(int i=1;i<n-1;i++){
            if(Math.min(maxRightArr[i],maxLeftArr[i])-arr[i]>0){
                tw += Math.min(maxRightArr[i],maxLeftArr[i])-arr[i];
            }
        }
        return tw;
    }
	public static void main(String[] args) {
		int arr[] = {4,2,0,6,3,2,5};
		System.out.println("Total trapped water = "+trappedWater(arr));
	}
}
