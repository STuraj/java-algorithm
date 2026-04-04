package day1;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }


    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(ts.twoSum(numbers, target)));
    }

}