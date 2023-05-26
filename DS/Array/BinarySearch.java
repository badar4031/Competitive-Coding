public class BinarySearch
{
    public static int binarySearc(int num[],int key){
        int start =0;
        int end = num.length-1;
        
        while(start<=end){      //start == end is forthe smallest array when array length will be 1
            int mid = (start+end)/2;
            
            if(num[mid] == key){
                return mid;
            }
            else if(num[mid] < key){        //right side of array
                start = mid+1;
            }
            else{
                end = mid-1;                //left side of array
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		int key = 5;
		int res = binarySearc(num,key);
		if(res ==-1)
		    System.out.println("Number not found");
		else
		    System.out.println("Number found at Index "+res);
	}
}

