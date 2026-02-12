class Solution {
    public int searchInsert(int[] nums, int target) {
      int l=0;
      int h=nums.length-1;
      while(l<=h){
          int m=(l+h)/2;
          if(nums[m]==target)
              return m;
          else if(target<nums[m])
              h=m-1;    
          else if(target>nums[m])
              l=m+1;
      } 
      return l;
    }
}
