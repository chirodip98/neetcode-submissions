class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i< nums.length; i++)
        {
           
            int rem = target - nums[i];
            if(hashMap.containsKey(rem))
            {
                int ans[] = new int[]{i, hashMap.get(rem)};
                Arrays.sort(ans);
                return ans;
            }
             hashMap.put(nums[i],i);
        }
               

        return new int[]{-1,-1};

    }
}
