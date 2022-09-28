class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]){
            return 0;
        }
        else if(target > nums[nums.length-1]){
            return nums.length;
        }
        else{
            int i;
            for(i = 1;i<nums.length;i++){
                if((target > nums[i-1])&&(target <= nums[i])){
                    break;
                }
            }
            return i;
        }
    }
}