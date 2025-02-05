class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] arr = s2.toCharArray();
        if(s1.equals(s2)) return true;

        for(int i = 0; i< arr.length; i++){
            for(int j = i; j< arr.length; j++){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                if(s1.equals(new String(arr))) return true;
                else {
                    char temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }
        }
        return false;
    }
}