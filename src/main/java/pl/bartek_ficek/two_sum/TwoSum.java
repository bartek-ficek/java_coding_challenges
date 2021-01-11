package pl.bartek_ficek.two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class TwoSum {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {
        String result = Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9));
        STDOUT.info("\n{}", result);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] output = new int[2];
        //Labels are not commonly used (disadvised)
        main_loop:
        for (int i = 0; i < nums.length; i++) {
            int j;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output = new int[]{i, j};
                    break main_loop;
                }
            }
        }
        return output;
    }
}
