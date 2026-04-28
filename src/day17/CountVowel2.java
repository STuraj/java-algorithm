package day17;

public class CountVowel2 {
    public static void main(String[] args) {
        String st = "Best model of the world";
        int count =0;
        st.toLowerCase();
        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);
            if (ch=='a' || ch=='e' || ch =='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels:" + count);
    }
}
