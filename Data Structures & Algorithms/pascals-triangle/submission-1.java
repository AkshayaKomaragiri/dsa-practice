class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) return list;
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        list.add(row1);
        if (numRows == 1) return list;
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        prev.add(1);
        list.add(prev);
        if (numRows == 2) return list;
        numRows-=2;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < numRows;i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int right = 1; right < prev.size(); right++){
                sum = prev.get(left) + prev.get(right);
                row.add(sum);
                left++;
                sum = 0;
            
            }
            row.add(1);
            left = 0;
            prev = row;
            list.add(row);

        }
        return list;
    }
}