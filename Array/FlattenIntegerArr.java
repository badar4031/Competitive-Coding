// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FlattenIntegerArr {
    
    public static Integer[] flattenArr(Object arr[]) throws IllegalArgumentException
    {
        List<Integer> res = new ArrayList<Integer>();
        if(arr==null)
            return null;
        
         for(Object i : arr){
             if(i instanceof Integer){
                 res.add((Integer)i);
             }
             else if (i instanceof Object[]){
                 res.addAll(Arrays.asList(flattenArr((Object[]) i)));
             }
             else {
                throw new IllegalArgumentException("Input must be an array of Integers or nested arrays of Integers");
            }
         }
          return res.toArray(new Integer[res.size()]);
    }
    
    public static void main(String[] args) {
        Object arr[] = { 11, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        Integer res[] = flattenArr(arr);
        System.out.println("Hello, World!");
    }
}
