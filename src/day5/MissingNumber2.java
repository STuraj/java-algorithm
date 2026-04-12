package day5;

public class MissingNumber2 {
    public static int findMissing(int []arr){
        int xor = arr.length;
        for (int i=0; i<arr.length; i++){
            xor ^= i^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int [] arr = {0, 4, 2, 1, 5};
        System.out.println(findMissing(arr));
    }
}
