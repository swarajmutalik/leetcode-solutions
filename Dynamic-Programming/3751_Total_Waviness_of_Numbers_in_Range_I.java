class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;

        for(int i = num1; i <= num2; i++){
            int temp = i;

            while (temp >= 100){
                int right = temp % 10;
                int middle = (temp / 10) % 10;
                int left = (temp / 100) % 10;

                if ((left < middle && middle > right) ||
                    (left > middle && middle < right)) {
                    count++;
                }
                temp = temp /10;
            }
        }
        return count;
    }
}
