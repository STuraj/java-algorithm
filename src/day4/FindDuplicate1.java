package day4;

import java.util.HashSet;

public class FindDuplicate1 {
    public static void main(String[] args) {
        //using HashSet
        int[] arr = {2, 3, 8, 4, 2, 7, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate:" + num);
            }
        }
    }
}
