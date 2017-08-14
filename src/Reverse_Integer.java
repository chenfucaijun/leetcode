
public class Reverse_Integer {
    public int reverse(int x) {
        //-2147483648-2147483647 1534236469
        //-3463847412
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int sum  = 0;
        while (x != 0) {
            int temp = x%10;
            if(sum<(min/10)||sum>max/10){
                return 0;
            }
            sum = sum*10+temp;

            x=x/10;
        }
        return sum;

    }
}
