class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                m = Math.max(m,count);
            }
            else{
                count=0;
            }
        }
        return m;
    }
}
