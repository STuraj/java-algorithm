package day5;

public class FirstNonRepeatingCharacter1 {
    public static void main(String[] args) {
        String st= "swiss";
        for (int i=0; i< st.length(); i++){
            boolean unique = true;
            for (int j=0; j< st.length(); j++){
                if (i!=j && st.charAt(i) == st.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (unique){
                System.out.println("First non-repeating character:" + st.charAt(i));
                return;
            }
        }
    }
}
