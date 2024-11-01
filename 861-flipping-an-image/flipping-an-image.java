class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0; i< image.length; i++){
            int start = 0; 
            int end = image[i].length -1;

            while(start < end){
                swap(image[i], start, end);
                start++;
                end--;
            }
        }

        for(int i= 0; i< image.length; i++){
            for(int j= 0; j < image[i].length; j++){
                if( image[i][j] == 1)  image[i][j] = 0;
                else if(image[i][j] == 0)  image[i][j] = 1;
            }
        }
        return image;
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}