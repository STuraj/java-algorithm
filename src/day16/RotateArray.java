package day16;

public class RotateArray {
    public static void rotate(int [] num, int k){
        k=k%num.length;
        reverse(num, 0, num.length-1);
        reverse(num, 0,k-1);
        reverse(num,k, num.length-1);
        }
        public static void reverse(int[] num, int start, int end){
        while (start<end){
            int temp = num[start];
            num[start]= num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6,7};
        int k=3;
        rotate(num,k);
        for (int nums: num){
            System.out.print(nums + "");
        }
    }
}
