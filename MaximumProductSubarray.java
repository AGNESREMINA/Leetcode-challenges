class Solution {
    public int maxProduct(int[] nums) {
        int p = 1,p1=1;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
        max = Math.max(max,p);
        if(p==0){
            p=1;
           }
        }   
        for(int i=nums.length-1;i>=0;i--){
            p1*=nums[i];
            max = Math.max(max,p1);
        if(p1==0){
            p1=1;
        }
        } 
        return max;
    }
}
