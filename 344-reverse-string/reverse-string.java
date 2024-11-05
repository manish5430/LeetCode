class Solution {
    public void reverseString(char[] s) {
        int start = 0; 
        int end = s.length-1;

        while( start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));

    }

    // static void swap(char[] arr, int start, int end ){
    //     char temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    // }
}