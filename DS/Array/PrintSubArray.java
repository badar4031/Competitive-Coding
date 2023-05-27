public class PrintSubArray
{
    public static void printSubArray(int arr[]){
        int n= arr.length;
        int totalSubArray=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        //O(n^2)
        System.out.println("otal number of sub array = "+totalSubArray);
        //O(1)
        System.out.println("otal number of sub array = "+(n*(n-1))/2);
    }
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5,6};
		printSubArray(arr);
	}
}
