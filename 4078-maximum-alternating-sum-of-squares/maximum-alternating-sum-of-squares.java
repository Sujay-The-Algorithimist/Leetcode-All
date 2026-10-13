
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) ->
            Integer.compare(Math.abs(a), Math.abs(b))
        );

        int flag = 0;
        long cnt = 0;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            if (flag == 0) {
                cnt += (long) arr[r] * arr[r];
                r--;
                flag = 1;
            } else {
                cnt -= (long) arr[l] * arr[l];
                l++;
                flag = 0;
            }
        }

        return cnt;
    }
}
