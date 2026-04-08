package day1;

public class ReverseSentence {
    public static String reverseSentence(String st){
        String [] words = st.split(" ");
        String result = "";
        for (int i = words.length -1; i>=0; i--){
            result += words [i] + " ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        String sentence = "I love Java";
        System.out.println(reverseSentence(sentence));
    }
}
