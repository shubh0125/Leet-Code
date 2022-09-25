class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int ans = 0;
        int j = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[j] != nums[i]){
                temp.add(nums[i]);
                ans++;
                j = i;
            }
        }
        int k=0;
        for(Integer x:temp){
            nums[k++] = x;
        }
        return ans+1;
    }
}
