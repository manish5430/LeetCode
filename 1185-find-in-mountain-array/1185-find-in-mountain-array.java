class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        return search(mountainArr, target);
    }
    static int search(MountainArray mountainArr, int target){
        int max = binarysearch(mountainArr, target);

        int FirstTry = OrderAgnostic(mountainArr, target, 0, max);
        if(FirstTry != -1){
            return FirstTry;
        }
        return  OrderAgnostic(mountainArr, target, max, mountainArr.length()-1);
            

    }

    static int binarysearch(MountainArray mountainArr, int target){
        int start = 0;
        int end = mountainArr.length()-1;

        while(start < end ){
            int mid= ( start + end )/2;
            if( mountainArr.get(mid) > mountainArr.get(mid +1)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    static int OrderAgnostic(MountainArray mountainArr, int target, int start, int end){
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end){
            int mid = start +(end-start)/2;
            
            if(target == mountainArr.get(mid)){
                return mid;
            }

            if(isAsc){
                if(target < mountainArr.get(mid)){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else{
                if(target > mountainArr.get(mid)){
                    end  = mid-1;;
                }
                else{
                   start = mid+1;
                }
            }
           
        } return -1;
    }
}