import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public int lengthOfLongestSubstring(String s) {

        int ans =0;
        for(int i =0 ;i<s.length();i++){

            for(int j = i+1;j<=s.length();j++){
                if(allUnique(s,i,j)){
                    ans = Math.max(ans,j-i);
                }

            }

        }
        return  ans;


    }

    public boolean allUnique(String s,int start,int end){
        Set<Character>  set = new HashSet<>();
        for(int i =start;i<end;i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            }
            set.add(s.charAt(i));

        }
        return  true;


    }



    public int slide(String s ){

        if(s.length()==0||s==null) return 0;
        int left = 0;
        int right =0;
        int ans =0;
        int n  = s.length();
        Set<Character> set  = new HashSet<>();
        while(left<n&&right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                ans = Math.max(ans,right-left);

            }else{
                set.remove(s.charAt(left++));

            }

        }
        return ans;
    }
}
