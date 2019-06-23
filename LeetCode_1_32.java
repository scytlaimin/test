package leecode;

import java.util.HashMap;

/**
 * 两数之和
 */
public class LeetCode_1_32 {

    /**
     * 一个循环( 6 ms )
     */
    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(i != 0){
                Integer index = map.get(target - nums[i]);
                if (index != null && index != i)
                    return new int[]{index, i };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 两个循环( 8 ms )
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i)
                return new int[]{i, index};
        }
        return new int[0];
    }

    /**
     * 嵌套循环( 54 ms )
     */
    public int[] twoSum3(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[0];
    }

}
