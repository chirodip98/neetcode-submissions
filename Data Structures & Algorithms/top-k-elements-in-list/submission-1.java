class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer>[] count = new List[nums.length+1];
        
        for(int i : nums)
        {
            frequency.put(i, frequency.getOrDefault(i,0)+1);
        }

        for(int i=0; i< count.length; i++)
            count[i] = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet())
            count[entry.getValue()].add(entry.getKey());

        int res[] = new int[k];
        int idx = 0;
        for(int i =count.length-1; i>=0; i--)
        {
            for(int j : count[i])
            {
                res[idx]=j;
                idx++;
                if(idx == k) return res;
            }
        }

        return res;
    }
}
