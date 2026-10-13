
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {

        Arrays.sort(nums); // We'll sort by absolute value below

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> 
            Integer.compare(Math.abs(a), Math.abs(b))
        );

        int l = 0;
        int r = arr.length - 1;
        long cnt = 0;

        while (l < r) {
            long big = arr[r];
            long small = arr[l];

            cnt += big * big - small * small;

            l++;
            r--;
        }

        if (l == r) {
            long mid = arr[l];
            cnt += mid * mid;
        }

        return cnt;
    }
}
