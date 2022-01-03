package javase9.ch4;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class array2d {
    public static void main(String[] args) {
       int[][]arr = {{1,2},{3,4}} ;
       for(int i = 0;i<arr.length;i++){
           for(int j = 0;j<arr[i].length;j++){
               System.out.println(arr[i][j]);
           }
       }
       for(int[] d : arr){
           for(int c : d){
               System.out.println(c);
           }

       }
      //Arrays fill is different from Collections nCopies
      //because nCopies is return for List not Array
      //but Arrays fill is for Array!!
       String[]test1 = new String[10];
       Arrays.fill(test1,"tt");
       List<String>list = new ArrayList<>();
       list = Collections.nCopies(10, "10");
       System.out.println(Arrays.toString(test1));
    }

    
}
