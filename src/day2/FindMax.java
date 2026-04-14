package day2;

public class FindMax {
    public static int findmax(int [] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = {3,7,2,9,5};
        int result = findmax(num);
        System.out.println("Maximum value is: " + result);
    }
}
