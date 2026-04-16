import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String roman){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;
        for (int i=0; i<roman.length(); i++){
            int current = map.get(roman.charAt(i));
            if (i<roman.length()-1 && current<map.get(roman.charAt(i+1))){
                total -=current;
            }else {
                total += current;
            }
        }
        return total;
    }

    public static void main(String[] args) {
      //  String roman = "MCMXII";
        String roman = "MCDXII";
        System.out.println(romanToInteger(roman));
    }
}
