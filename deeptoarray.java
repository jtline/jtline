package Array;

import java.util.Arrays;
//tostring and deeptostring different
public class arraydeep {
    public static void main(String[] args) {
        String [] abc={"e","ee","eee"};
        System.out.println(Arrays.toString(abc));
        System.out.println(Arrays.deepToString(abc));
        String [][] avc = {{"e","ee","eee"},{"e","ee","eee"}};

        System.out.println(Arrays.toString(avc));
        System.out.println(Arrays.deepToString(avc));
   
        String [][][] avtripple = {{{"e","ee","eee"},{"e","ee","eee"}},{{"e","ee","eee"},{"e","ee","eee"}}};
        
        System.out.println(Arrays.toString(avtripple));
        System.out.println(Arrays.deepToString(avtripple));
    }
}
