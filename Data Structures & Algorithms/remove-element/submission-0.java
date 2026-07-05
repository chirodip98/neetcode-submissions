class Solution {
    public int removeElement(int[] nums, int val) {

        int track =0;
        int move = 0;

        while(move<nums.length)
        {
            if(nums[move]!=val)
            {
                int temp = nums[track];
                nums[track] = nums[move];
                nums[move]=temp;
                track++;
            }
            move++;
        }

        return track;
        
    }
}