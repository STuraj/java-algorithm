package day4;

public class CountVowels {
    public static void main(String[] args) {
        String st= "Hello World";
        int count = 0;
        st = st.toLowerCase();
        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if (ch == 'a'||ch == 'e'|| ch == 'i'
                    || ch == 'o'|| ch == 'u'){
                count ++;
            }
        }
        System.out.println("Number of vowels:" + count);
    }
}
