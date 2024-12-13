class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr, (a,b) -> {
            String s1 = a + "" + b;
            String s2 = b + "" + a;

            return s2.compareTo(s1);
        });

        if(arr[0] == 0)  return "0";

        int[] nums2 = Arrays.stream(arr).mapToInt(Integer :: intValue).toArray();

        StringBuilder sb3 = new StringBuilder();
        for(int num : nums2){
            sb3.append(num);
        }
        return sb3.toString();
    }
}