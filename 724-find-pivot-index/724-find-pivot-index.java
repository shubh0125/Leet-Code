class Solution {
    public int pivotIndex(int[] nums) {
        int l= nums.length;
        int r=0;
        int nn=0;
        while(r<l){
            int sl=0;
            int sr=0;
            for(int i=0; i<r;i++){
                sl=sl+nums[i];
            }
            for(int j=l-1;j>r;j--){
                sr=sr+nums[j];
            }
            if(sr==sl){
                nn=r;
                break;
            }
            else if(sr!=sl){
                nn=-1;
            }
            r++;
        }
        return nn;
    }
}