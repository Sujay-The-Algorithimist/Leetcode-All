class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            if(nums[r]!=0)
            {
                int x=nums[l];
                nums[l]=nums[r];
                nums[r]=x;
                l++;
            }
            r++;
        }
    }
}