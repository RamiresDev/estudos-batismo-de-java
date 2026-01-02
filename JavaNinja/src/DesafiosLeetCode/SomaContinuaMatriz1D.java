package DesafiosLeetCode;

public class SomaContinuaMatriz1D {
        public int[] runningSum(int[] nums) {

            int acumulador = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i] += acumulador;
                acumulador = nums[i];
            }
            return nums;
        }
}
