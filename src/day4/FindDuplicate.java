package day4;

public class FindDuplicate {
    public static void main(String[] args) {
        //two loops(brute force)
        int [] arr = {1,2,3,4,3,5,2};
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate:" + arr[i]);
                }
            }
        }
    }
}
