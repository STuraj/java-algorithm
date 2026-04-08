package day1;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Morning";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

    }
}
