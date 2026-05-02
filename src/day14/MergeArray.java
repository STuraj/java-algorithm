package day14;

import java.util.Arrays;

public class MergeArray {
    public  int [] mergeArray(int [] num1, int [] num2){
        int [] result = new int[num1.length + num2.length];
        for (int i=0; i< num1.length; i++){
            result[i]= num1[i];
        }
        for (int i=0; i<num2.length; i++){
            result[num1.length+i] = num2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        MergeArray ma = new MergeArray();
        int[] num1 = {1,2,3};
        int [] num2 = {5,6,4};
        System.out.println(Arrays.toString(ma.mergeArray(num1,num2)));
    }
}
