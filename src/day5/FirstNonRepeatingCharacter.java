package day5;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String st = "concepts";
        HashMap<Character, Integer> map= new HashMap<>();
        for (char ch : st.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
                    }
        for (char ch : st.toCharArray()) {
            if (map.get(ch) ==1){
                System.out.println("First non-repeating character:" + ch);
            }
        }
        System.out.println("no non-repeating character");
    }

}
