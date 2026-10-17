class Solution {
    int f(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum=sum+(x%10);
            x=x/10;
        }

        return sum;
    }
    public int minSwaps(int[] nums) {
        ArrayList<Integer>arr=new ArrayList();
        for(int c:nums)
        {
            arr.add(c);
        }
        Collections.sort(arr, (a, b) -> {
            if (f(a) != f(b)) {
                return Integer.compare(f(a), f(b));
            }
            return Integer.compare(a, b);
        });

        int cnt=0;
        Map<Integer,Integer>mpp=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],i);
        }

        // 18, 43, 34, 16
        // 16, 34, 43, 18

        for(int z=0;z<nums.length;z++)
        {
            if(arr.get(z)!=nums[z])
            {
                int actual=arr.get(z);
                int current=nums[z];
                int current_ind=mpp.get(actual);

                nums[z]=actual;
                nums[current_ind]=current;

                // update
                mpp.put(actual,z);
                mpp.put(current,current_ind);
                cnt++;

            }
        }
        return cnt;
    }
}