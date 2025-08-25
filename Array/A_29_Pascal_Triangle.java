class Solution {

    private List<Integer> pascalRow(int row) {

        List<Integer> res = new ArrayList<>();

        res.add(1);

        for (int i = 1; i <= row; i++) {

            int num = res.get(i - 1);
            num = num * (row - i + 1);
            num = num / i;
            res.add(num);
        }
        ;

        return res;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            res.add(pascalRow(i));
        }

        return res;
    }
}