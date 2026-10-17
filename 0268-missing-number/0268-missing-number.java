class Solution {
    public int missingNumber(int[] nums) {
      int sum=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }

      int total=0;
      for(int i=0;i<=nums.length;i++){
        total+=i;
      }

      int result=total-sum;

      return result;
    }
}