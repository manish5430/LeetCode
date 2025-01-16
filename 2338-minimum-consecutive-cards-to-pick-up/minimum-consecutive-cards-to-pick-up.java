class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = Integer.MAX_VALUE;

        for(int i = 0; i< cards.length; i++){
            if(map.containsKey(cards[i])){
                int length = i - map.get(cards[i]) +1;
                len = Math.min(len, length);
            }
            map.put(cards[i], i);
        }
        if(len == Integer.MAX_VALUE) return -1;
        return len;
    }
}