import java.util.ArrayList;
import java.util.HashSet;


public class Intersection_of_Two_Arrays_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }


        int[] num = new int[list.size()];
        for(int i =0;i<num.length;i++){
            num[i] = list.get(i);
        }



        return num;
    }

}
