package day1;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        String num = String.valueOf(number);
        int left = 0;
        int right = num.length()-1;
        while(left<right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 131;
        System.out.println(isPalindrome(number));
    }
}
