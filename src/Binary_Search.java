
public class Binary_Search {
    public int binarySearch(int[] arr, int n, int target) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                //[mid+1,r]中寻找
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return -1;
    }

}


