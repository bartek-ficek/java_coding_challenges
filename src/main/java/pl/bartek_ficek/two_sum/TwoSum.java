package pl.bartek_ficek.two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        int[] numbers = new int[]{11, 7, 12, 3};
        int target = 14;
        try {
            String result1 = Arrays.toString(getTwoSumFirstWay(numbers, target));
            String result2 = Arrays.toString(getTwoSumSecondWay(numbers, target));
            STDOUT.info("\n{}", result1);
            STDOUT.info("\n{}", result2);
        } catch (NoSolutionException e) {
            STDOUT.error("\n{}", e.getMessage());
        }
    }

    static int[] getTwoSumFirstWay(int[] nums, int target) throws NoSolutionException {

        int[] output = new int[2];
        //Labels are not commonly used (disadvised)
        main_loop:
        for (int i = 0; i < nums.length; i++) {
            int j;
            for (j = i + 1; j < nums.length; j++) {
                if ((i == nums.length - 2) && (j == nums.length - 1)) {
                    throw new NoSolutionException();
                }
                if (nums[i] + nums[j] == target) {
                    output = new int[]{i, j};
                    break main_loop;
                }
            }
        }
        return output;
    }

    static int[] getTwoSumSecondWay(int[] nums, int target) throws NoSolutionException {

        Map<Integer, Integer> checkedNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (checkedNums.containsKey(delta)) {
                return new int[]{checkedNums.get(delta), i};
            }
            checkedNums.put(nums[i], i);
            if (i== nums.length-1) {
                throw new NoSolutionException();
            }
        }
        return new int[]{-1, -1};
    }


}
