public class Solution {

    public int[] nextPermutation(int[] nums) {
        /**
         * Why i-2 ? Because we do not want to be out of bounds as we will be comparing
         * two i values at the same time.
         */
        int i = nums.length - 2;

        /**
         * Run a loop from the reverse end to find the first value where the increasing
         * order does not match.Increasing order from right backwards.
         * 
         * i must be greater than/equal to zero
         * and
         * we compare two adjacent i values.
         */
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        /**
         * Once the loop ends, we are at the place where ith value is less than its
         * successor and it needs to be swapped.
         */
        if (i >= 0) {
            int j = nums.length - 1;
            /**
             * We loop through and find the immediate value of j that is greater than i.
             */
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        /**
         * Why i+1? Because ith location si already swapped and it is at the correct
         * location
         */
        reverse(nums, i + 1);
        return nums;

    }

    /**
     * Swap the values of index i and j of the input array.
     * 
     * @param nums input array
     * @param i    index i
     * @param j    index j
     */
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * Reverse part of the input array starting from a location.
     * 
     * @param nums The input array which should be (partially) reversed.
     * @param i    The starting index location to perform reversal of values.
     */
    public void reverse(int[] nums, int i) {
        /**
         * The end location
         */
        int j = nums.length - 1;
        /**
         * Loop through till i<j
         */
        while (i < j) {
            swap(nums, j, i);
            i++;
            j--;
        }

    }

}
