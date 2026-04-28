package day17;

import java.util.HashSet;

public class CountVowelHashSet {
    public static void main(String[] args) {
        String st = "Hello World".toLowerCase();
        int count = 0;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('o');
        vowels.add('i');
        vowels.add('u');
        for (char c : st.toCharArray()){
            if (vowels.contains(c)){
                count++;
            }
        }
        System.out.println("Number of vowels:" + count);
    }
}
