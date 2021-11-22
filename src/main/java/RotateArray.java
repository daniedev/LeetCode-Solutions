public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int temp = 0;
        for(int itr = nums.length - k, arrayIndex = 0; itr < nums.length; itr++, arrayIndex++) {
            temp = nums[arrayIndex];
            nums[arrayIndex] = nums[itr];
        }

        for (int itr = k; itr < nums.length -k; itr++) {
            temp = temp + nums[itr];
            nums[itr] = temp - nums[itr];
            temp = temp - nums[itr];
        }

        nums[nums.length - 1] = temp;
        return nums;
    }
}
