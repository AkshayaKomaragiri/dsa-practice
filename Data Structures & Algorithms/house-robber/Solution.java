class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] arr = new int[nums.length+1];
        arr[0] = nums[0];
        arr[1] = Math.max(arr[0], nums[1]);
        //[1, 8, 2]
        for (int i = 2; i < nums.length; i++){
            if (arr[i-2] + nums[i] >= arr[i-1]){
                arr[i] = arr[i-2] + nums[i];
            }
             else{
            arr[i] = arr[i-1];
        } 
        }
        return arr[nums.length-1];
       
    }
  
