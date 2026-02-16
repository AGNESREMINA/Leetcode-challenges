class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)return 1;
        int res=10,unique=9,available=9;
        for(int i=2;i<=n && available>0;i++){
            unique*=available--;
            res+=unique;
        }
        return res;
    }
}
