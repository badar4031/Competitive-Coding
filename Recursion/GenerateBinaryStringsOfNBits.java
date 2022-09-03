/******************************************************************************
    Given a positive integer number N. The task is to generate all the binary
    strings of N bits. These binary strings should be in ascending order.

*******************************************************************************/

public class Main
{ 
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    public static void generateAllBinaryString(int arr[], int n, int i){
        if(i==n){
            print(arr,n);
            return;
        }
        arr[i]=0;
        generateAllBinaryString(arr,n,i+1);
        arr[i]=1;
        generateAllBinaryString(arr,n,i+1);
    }
    public static void generateString(int n){
        int arr[] = new int[n];
        generateAllBinaryString(arr,n,0);
    }
	public static void main(String[] args) {
	    int n=4;
	    generateString(n);
	}
}
