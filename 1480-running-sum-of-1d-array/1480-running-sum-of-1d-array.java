
class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        for(int i=1;i<l;i++){
            int s = nums[i];
            nums[i] = s + nums[i-1];
        }
        return nums ;
    }
}