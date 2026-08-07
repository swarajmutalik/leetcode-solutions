class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int j = 0; j < nums.length; j++){
                count += (max - nums[j]);
            }
        return count;
    }
}
