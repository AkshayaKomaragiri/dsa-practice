class Solution {
    public int removeDuplicates(int[] nums) {
        int current = 0;
        int index = 1;
        int occurs = 1;
        current = nums[0];
       for (int i = 1; i < nums.length; i++){
            if (nums[i] == current){
                   occurs++;
            }
            else{
                current = nums[i];
                occurs = 1;
            }
            if (occurs <= 2){
                 nums[index] = nums[i];
                 index++;
            }
           
       }
        return index;
    }
}
