package day2;

public class FindMaximum {
    public static void main(String[] args) {
        int [] arr = {4, 5,9, 15,  3, 25};
        int max = arr[0];
        for (int num : arr){
            if (num>max){
                max=num;

            }
        }
        System.out.println(max);
    }
}
