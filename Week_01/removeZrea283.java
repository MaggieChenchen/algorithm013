class Solution {
    public void moveZeroes(int[] nums) {
        int num=0;//0µÄ¸öÊı
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0) num++;
            else {
                nums[i-num]=nums[i];
            }
        }
        for(int i=nums.length-1;i>nums.length-1-num;i--){
            nums[i]=0;
        }
    }
}