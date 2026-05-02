package day2;

public class FindMin {
    public static  int findMin(int[] arr){
        int min= arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,7,2,9};
        int result = findMin(arr);
        System.out.println("Minimum value is:" +result);
    }
}
