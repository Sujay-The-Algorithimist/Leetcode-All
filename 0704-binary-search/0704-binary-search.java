class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int j=(l+r)/2;
            //if(j>=nums.length) return -1;
            if(nums[j]>target)
            {
                r=j-1;
            }
            else if(nums[j]<target)
            l=j+1;
            else
            return j;
        }
        return -1;
    }
}