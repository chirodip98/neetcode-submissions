class Solution {
    public boolean hasDuplicate(int[] nums) {

        int size = nums.length;
        
        if(size>0)
        {
             Map<Integer, Integer> countMap = new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                if(countMap.containsKey(nums[i]))
                     return true;
                countMap.put(nums[i], countMap.getOrDefault(nums[i],0)+1);
            }

            return false;
        }
       
        return false;
    }
}