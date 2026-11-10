class Solution {
    public void moveZeroes(int[] nums) {
        
        int cnt0=0;
        for(int x:nums)
        {
            if(x==0)
            cnt0++;
        }
        int non0=nums.length-cnt0;
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