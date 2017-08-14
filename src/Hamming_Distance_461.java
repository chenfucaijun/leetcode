
public class Hamming_Distance_461 {
    public int hammingDistance(int x, int y) {
        int a = x^y;
        int n =0;
        while(a!=0){
            a=a&(a-1);
            n++;
        }
        return n;
    }
}
