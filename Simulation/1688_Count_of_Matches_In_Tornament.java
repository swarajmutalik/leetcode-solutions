class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        for(int i = n; i >= 1; i--){
            ans += n / 2;
            if(n%2 == 0){
                n = n / 2;
            }
            else if(n%2 == 1){
                n = (n / 2) + 1; 
            }
        }
        return ans;

    }
}
