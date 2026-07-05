class Solution {
    public int removeElement(int[] nums, int val) {

        int track =0;
        int move = 0;

        while(move<nums.length)
        {
            if(nums[move]!=val)
            {
                nums[track] = nums[move];
                track++;
            }
            move++;
        }

        return track;
        
    }
}