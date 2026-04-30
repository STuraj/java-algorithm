package day14;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s){
        int i =s.length()-1;
int length = 0;
while (i>=0 && s.charAt(i) == ' '){
    i--;
}
while (i>=0 && s.charAt(i)!=' '){
    length++;
    i--;
}
return length;
    }

    public static void main(String[] args) {
        String s = "favorite movie";
        LengthOfLastWord l = new LengthOfLastWord();
        System.out.println(l.lengthOfLastWord(s));
    }
}
