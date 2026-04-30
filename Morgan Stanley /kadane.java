class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int res = nums[0];
        // for(int i=0; i<n; ++i){
        //     int ans=0;
        //     for(int j=i; j<n; ++j){
        //         ans += nums[j];
        //         res = Math.max(res, ans);
        //     }
        // }
        // return res;
        // kadane's algo
        int currsum=nums[0];
        for(int i=1; i<n; ++i){
            currsum = Math.max(nums[i], nums[i]+currsum);
            res = Math.max(res, currsum);
        }
        return res;
    }
}
