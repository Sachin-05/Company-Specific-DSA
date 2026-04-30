class Solution {
    public int findPeakElement(int[] arr) {
        // // brute force
        // int n = arr.length;
        // if(n==1) return 0;

        // if((arr[0]>arr[1])){
        //     return 0;
        // }

        // if(arr[n-1] > arr[n-2]){
        //     return n-1;
        // }

        // int ans = -1;
        // for(int i=1; i<arr.length-1; i++){
        //     if((arr[i-1] < arr[i]) && (arr[i+1] <arr[i])){
        //         ans = i;
        //         break;
        //     }
        // }
        // return ans;
        // binary search
        int low=0, high=arr.length-1;

        while(low < high){
            int mid = (low + high) /2;
            if(arr[mid] < arr[mid+1]){
                low = mid+1;
            }else if(arr[mid] > arr[mid+1]){
                high = mid;
            }
        }
        return low;
    }
}
