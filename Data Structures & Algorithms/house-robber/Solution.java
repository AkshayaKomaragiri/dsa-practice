class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] arr = new int[nums.length+1];
        int first = nums[0];
        int second = Math.max(first, nums[1]);
        for (int i = 2; i < nums.length; i++){ 
                if (first + nums[i] > second){
                    int temp = second;
                    second = first + nums[i];
                    first = temp;
                }
                else{
                    first = second;
                }

        } 
        return second;
        
        
       
    }

    
}
