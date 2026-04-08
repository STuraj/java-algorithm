package day1;

public class ReverseString {
    public static void main(String[] args) {
        String st = "Good";
        String reversed = " ";
        for (int i= st.length() - 1; i>= 0; i--){
            reversed +=st.charAt(i);
        }
        System.out.println(reversed);
    }
}
