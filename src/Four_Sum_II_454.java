import java.util.HashMap;


public class Four_Sum_II_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i]+D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);

            }
        }
        int res = 0;
        for(int i=0; i<A.length; i++) {
            for(int j=0; j<B.length; j++) {
                res += map.getOrDefault(-1 * (A[i]+B[j]), 0);
            }
        }


        return res;

    }

}
