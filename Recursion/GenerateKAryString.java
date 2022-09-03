/******************************************************************************
    Given a positive integer number N and K. The task is to generate all the K
    strings of N bits. 

*******************************************************************************/

public class Main
{ 
    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    public static void generateKAryString(int arr[], int n, int i,int k){
        if(i==n){
            print(arr,n);
            return;
        }
        for(int j=0;j<=k;j++){
            arr[i]=j;
            generateKAryString(arr,n,i+1,k);
        }
        
    }
    public static void generateString(int n,int k){
        int arr[] = new int[n];
        generateAllBinaryString(arr,n,0,k);
    }
	public static void main(String[] args) {
	    int n=4;
	    int k=2;
	    generateString(n,k);
	}
}
