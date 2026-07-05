class Solution {
    public int[] getConcatenation(int[] nums) {

        int size = nums.length;
        if (size==0) return new int[size];

        int ans[] = new int[size * 2];
        int cyc_indx = 0;
        int ptr = 0;

        for(; ptr< ans.length; ptr++)
        {
            ans[ptr] = nums[cyc_indx];
            cyc_indx +=1;
            cyc_indx = cyc_indx % size;
        }
        
        return ans;
    }
}