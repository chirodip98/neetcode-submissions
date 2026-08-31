class Solution {
    public int[] findBuildings(int[] heights) {
        Deque<int[]> stack = new ArrayDeque<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peek()[1] <= heights[i]) {
                stack.pop();
            }
            stack.push(new int[] {i, heights[i]});
        }

        int answer[] = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty()) answer[i--]=stack.pop()[0];
        return answer;
    }
}