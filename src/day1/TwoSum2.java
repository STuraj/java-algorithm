package day1;

import java.util.Arrays;

public class TwoSum2 {
    public int [] twoSum(int [] nums, int target){
        for (int i=0; i<nums.length; i++){
            for (int k=i+1; k<nums.length; k++){
                if (nums[i] + nums[k] == target){
                    return new int [] {i, k};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums [] = {2, 5, 8, 7, 11, 3};
        int target = 10;
        TwoSum2 ts = new TwoSum2();
        System.out.println(Arrays.toString(ts.twoSum(nums, target)));
    }
}
