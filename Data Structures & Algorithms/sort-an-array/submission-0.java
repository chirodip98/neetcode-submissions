class Solution {
    public int[] sortArray(int[] nums) {

        Queue<Integer> heap = new PriorityQueue<>();
        for(int i : nums)
            heap.add(i);
        

        for(int i=0;i<nums.length;i++)
        {
            if(!heap.isEmpty())
                nums[i]=heap.poll();
        }

        return nums;
    }
}