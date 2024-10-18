/**
 * Class for sorting an array using the Bubble Sort algorithm.
 */
public class BubbleSort {
    
    /**
     * Sorts an array using the Bubble Sort algorithm.
     *
     * @param nums the array to be sorted
     * @return the sorted array
     */
    public int[] sort(int[] nums) {
        // Perform Bubble Sort
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                // Compare adjacent elements and swap if needed
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
    
    // Example usage
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {5, 3, 8, 4, 2}; // Example input array
        int[] sortedArray = bubbleSort.sort(nums);
        
        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
