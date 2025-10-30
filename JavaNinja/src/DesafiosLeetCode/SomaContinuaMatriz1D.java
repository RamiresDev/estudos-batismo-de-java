package DesafiosLeetCode;

public class SomaContinuaMatriz1D {
        public int[] runningSum(int[] nums) {
           // runningSum = nums [ primeiro + segundo, primeiro + segundo + terceiro e etc]
            int[] counter = new int[]{nums.length};

            for (int i = 0; i < nums.length; i++) {
                counter[i] = nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    counter[i] = nums[i+j];
                }
            }
            return counter;
        }
}
