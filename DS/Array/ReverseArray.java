
/*Optimized way to Reverse an array is consider first and last element and swap both the numbers, in the enxt itteration 
increast first by 1 and decrease last by 1until you reach mid of array. i. first<last*/
public class ReverseArray
{
    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length-1;
        while(first<last){
            num[first] = num[first]+num[last];
            num[last] = num[first]-num[last];
            num[first] = num[first]-num[last];
            first++;
            last--;
        }
    }  
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7};
		reverseArray(num);
		for(int i=0;i<num.length;i++){
		    System.out.print(num[i]+"  ");
		}
	}
}
