class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digit = 0;
        for(int i = 0; i < nums.length; i++){
            elementSum += nums[i];

        while(nums[i] > 0){
            digit = digit + nums[i] % 10;
            nums[i] = nums[i] / 10;
        }
    }
    return elementSum - digit;
    }
}
