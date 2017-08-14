
public class Longest_Palindromic_Substring_5 {
    public String longestPalindrome(String s) {
        int size =  s.length();
        int[][] dp = new int[size][size];
        int left = 0;
        int right =0;
        int max = 0;

        for(int i =0;i<size;i++){
            dp[i][i] =1;
        }
        /**
         *
         *
         *    aaaa
         *
         */
        for(int i =0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] +2;
                    if(dp[i][j]>max){
                        max =  dp[i][j];
                        left = i;
                        right = j;
                    }
                }else{
                    if(dp[i+1][j]>dp[i][j-1]){
                        dp[i][j] = dp[i+1][j];
                        if(dp[i+1][j]>max){
                            max =  dp[i+1][j];
                            left = i+1;
                            right = j;
                        }

                    }else{
                        dp[i][j] = dp[i][j-1];
                        if(dp[i][j-1]>max){
                            max =  dp[i][j-1];
                            left = i;
                            right = j-1;
                        }
                    }
                }
            }
        }
        return s.substring(left,right+1);
    }


}
