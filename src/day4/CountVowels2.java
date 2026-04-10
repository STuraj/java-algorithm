package day4;

public class CountVowels2 {
    public static void main(String[] args) {
        String st = "I Love Java ";
        int count = 0;
        st = st.toLowerCase();
        String vowels = "aeiou";
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                System.out.println("Number of vowels:" + ch);
                count++;
            }
        }
        System.out.println("Total vowels:" + count);

    }
}
