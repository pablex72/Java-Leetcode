import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 7, 1};
        int target = 7;

        int[] out = twoSum(nums, target);
        System.out.println(out[0] + " " + out[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }
}
