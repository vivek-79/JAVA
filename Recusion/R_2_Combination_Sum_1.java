class Solution {

    private void solution(int[] candidates, int target, int len, int i, List<List<Integer>> ans, List<Integer> ds) {

        if (i == len) {
            if (target == 0) {
                ans.add(new ArrayList(ds));
            }
            return;
        }
        ;

        if (candidates[i] <= target) {
            ds.add(candidates[i]);
            solution(candidates, target - candidates[i], len, i, ans, ds);
            ds.remove(ds.size() - 1);
        }
        solution(candidates, target, len, i + 1, ans, ds);
    };

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int len = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solution(candidates, target, len, 0, ans, ds);
        return ans;
    }
}