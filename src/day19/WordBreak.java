package day19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict){
        Set<String> set  = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0]=true;
        for (int i=1; i<=s.length();i++){
            for (int j=0; j<i; j++){
                if (dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }

    public static void main(String[] args) {
        WordBreak wb = new WordBreak();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");
        System.out.println(wb.wordBreak(s,wordDict));
    }
}
