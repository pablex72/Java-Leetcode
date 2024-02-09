public class TwoSum {
//    Given an array of integers nums and an integer target, return indices of the
//    two numbers such that they add up to target.

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
    //Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target  = 9;

        int[] nums = {3,2,4};
        int target  = 6;

        int[] out = twoSum(nums,target);
        System.out.println(out[0]+" "+out[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] output= new int[2];
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            for(int j =0; j< nums.length; j++){
                System.out.println("i "+ nums[i]+" " +"j "+nums[j]);
                if((i!=j) && (nums[i]+nums[j]==target)){
                    output[0] = j;
                    output[1] = i;
                }
            }

        }
        return output;
    }
}
