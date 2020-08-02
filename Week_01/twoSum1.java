class Solution {
 public int[] twoSum(int[] nums, int target) {
        int [] r=new int[2];
        Map <Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i])!=null) {
                r[0]=map.get(target-nums[i]);
                r[1]=i;
                return r;
            }
            map.put(nums[i],i);
        }
        return r;
 }
}