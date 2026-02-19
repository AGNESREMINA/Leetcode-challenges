class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []a=new int[2];
        a[0]=-1;
        a[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                a[1]=i;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(target==nums[i])
            {
                a[0]=i;
            }
        }
        return a;
    }
}
