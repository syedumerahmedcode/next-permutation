import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * A permuattio of an array of integers is an arrangement of its memmbers into a
         * sequence or linear order.
         * 
         * For example; for arr={1,2,3}, the following are all the permutations of
         * arr:{1,2,3}, {1,3,2}, {2,1,3}, {2,3,1}, {3,1,2}, {3,2,1}
         * 
         * The 'next permuattion' of an array of integers is the nect lexiographically
         * greater permuattion of its integer.More formally, if all the permutations of
         * the arrayare sorted in one container according to their lexiographical order,
         * then the next permuation of that array is the permutation that follows it in
         * the sorted container. If such arrangement is not possible, the array must be
         * rearranged as the lowest possible order (i.e. sorted in ascending order).
         * 
         * For example, the next permutation of arr = {1,2,3} is {1,3,2}.
         * Similarly, the next permutation of arr = {2,3,1} is {3,1,2}.
         * While the next permutation of arr = {3,2,1} is {1,2,3} because {3,2,1}doesnot
         * have a lexiographical larger rearrangement.
         * 
         * Given an array of integer 'nums', find the 'next permutation of nums'.
         * 
         * The replacement must be in place and use only constant extra memory
         * 
         */
        System.out.println("Hello, World!");
        Solution solution = new Solution();
        int[] nums = { 1, 2, 3 };
        int[] result = solution.nextPermutation(nums);
        System.out.println("The given input is: " + Arrays.toString(nums) + " and the next permutation is: "
                + Arrays.toString(result));

    }
}
