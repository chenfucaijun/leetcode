
public class Palindrome_Number {
    public boolean isPalindrome(int x) {

        if (x==0){
            return true;
        }
       if(x<0||x%10==0){
           return false;
       }
       int rightPart = 0;
       while (x>rightPart){
           rightPart = rightPart*10 +x%10;
           x =  x/10;
       }
       if(rightPart==x || rightPart/10 ==x){
           return true;
       }

        return false;
    }
}
