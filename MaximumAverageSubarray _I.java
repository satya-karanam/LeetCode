class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double currentsum=0;
        double mxAvg=-1000000;
        for(int right=0; right<nums.length;right++){
            currentsum += nums[right];
            if(right>=k-1){
                double cAvg = currentsum/k;
                mxAvg=Math.max(cAvg,mxAvg);
                currentsum-=nums[left];
                left++;
            }
        }
        return mxAvg;
    }
}
