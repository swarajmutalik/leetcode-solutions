class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> arr = new HashSet<>();

        for(int i = 0; i < friends.length; i++){
            arr.add(friends[i]);
        }

        int[] resArr = new int[friends.length];
        int index = 0;

        for(int j = 0; j < order.length; j++){
            if(arr.contains(order[j])){
                resArr[index++] = order[j];
            }
        }
        return resArr; 
    }
}
