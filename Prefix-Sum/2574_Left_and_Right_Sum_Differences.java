class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){

            int leftSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += nums[j];
            }

            int rightSum = 0;
            for(int j = i + 1; j < n; j++){
                rightSum += nums[j];
            }

            answer[i] = Math.abs(leftSum - rightSum);
        }

        return answer;
    }
}
