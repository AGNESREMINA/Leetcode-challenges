class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> arr = new ArrayList<>();
        int n = candies.length;
        int max = candies[0];
        for(int i=0;i<n;i++){
            max = Math.max(candies[i],max);
        }
        for(int i=0;i<n;i++){
            if((candies[i] + extraCandies)>= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}
