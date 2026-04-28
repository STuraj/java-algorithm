package day17;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Hello Java";
        int count = 0;
        s=s.toLowerCase();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String vowels = "a,e,o,u,i";
            if (vowels.indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("Number of vowels:" +count);
    }
}
