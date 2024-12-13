class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[] :: new);
        Arrays.sort(arr, (a,b) -> {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            sb1.append(a).append(b);
            sb2.append(b).append(a);

            // int n1 = Integer.parseInt(sb1.toString());
            // int n2 = Integer.parseInt(sb2.toString());

            // return n2 - n1;

            return sb2.toString().compareTo(sb1.toString());
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