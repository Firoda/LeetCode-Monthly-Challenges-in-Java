class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length <=1)
            return 0;

        List<Integer> dp = new ArrayList<Integer>();

        dp.add(0);
        dp.add(0);

        for(int i=2; i<=cost.length; i++){

            int curr_dp = Integer.MAX_VALUE;

            curr_dp = Math.min(curr_dp, dp.get(i-1) + cost[i-1]);
            curr_dp = Math.min(curr_dp, dp.get(i-2) + cost[i-2]);

            dp.add(curr_dp);
        }

        int dpLen = dp.size();

        return dp.get(dpLen - 1);
    }
}