class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int[] freq = new int[10];

        for(int num : digits){
            freq[num]++;
        }

        for(int i = 1; i<= 9; i++){
            if(freq[i] == 0) continue;
            freq[i]--;
            for(int j = 0; j<= 9; j++){
                if(freq[j] == 0) continue;
                freq[j]--;
                for(int k = 0; k<= 8; k+= 2){
                    if(freq[k] == 0)continue;
                    freq[k]--;

                    int num = i*100 + j*10 + k;
                    set.add(num);
                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++;
        }

        int[] ans = new int[set.size()];
        int i = 0;
        for(int num : set){
            ans[i++] = num;
        }
        Arrays.sort(ans);
        
        return ans;
        
    }
}