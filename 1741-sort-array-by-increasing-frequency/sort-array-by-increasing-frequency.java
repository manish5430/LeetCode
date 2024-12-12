import java.util.Arrays;
class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freqArr = new int[202];
        for(int num : nums){
            freqArr[num + 100]++;
        }

        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr, (a,b) -> {
            if(freqArr[a +100] != freqArr[b +100]) return freqArr[a +100] - freqArr[b +100];
            return b -a;
        });

        return Arrays.stream(arr).mapToInt(Integer :: intValue).toArray();
    }
}