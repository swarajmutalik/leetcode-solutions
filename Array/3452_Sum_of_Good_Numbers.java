class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            int left = (i - k < 0) ? 0 : nums[i - k];
            int right = (i + k >= nums.length) ? 0 : nums[i + k];
            if(nums[i] > left && nums[i] > right){
                sum += nums[i];
            }
        }
        return sum;
    }
}
