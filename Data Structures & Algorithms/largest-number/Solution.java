class Solution {
    public String largestNumber(int[] nums) {
        //[34, 30, 9, 5, 3]
        //[10,2,9,39,17]
        //9210
        StringBuilder str = new StringBuilder();
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));

        if (arr[0].equals("0")) return "0";

        for (int i = 0; i < arr.length; i++){
            str.append(arr[i]);
        }
        return str.toString();
        
}
}
