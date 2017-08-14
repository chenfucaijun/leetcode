import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_3_Sliding_Window {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int i = 0, j = 0, ans = 0;
        Set<Character> set = new HashSet<>();


        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {

            }
        }

        return ans;


    }

    public int lOfSubstring(String s) {
        Set<Character> set = new HashSet<>();
        //dabcd
        int an= 0;
        for(int i = 0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(aSubstring(s,i,j)){
                    an = Math.max(an,j-i+1);
                }
            }
        }


        return an;
    }

    public boolean aSubstring(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)){
                return  false;
            }
            set.add(ch);
        }


        return true;
    }


}
