import java.util.PriorityQueue;
import java.util.Random;

public class FinfKthLargestElement {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4}; int k=2;
        findKthLargest(nums,k);
    }
        public static int findKthLargest(int[] nums, int k) {
            int left = 0, right = nums.length - 1;
            Random rand = new Random();
            while (true) {
                int pivot_index = left + rand.nextInt(right - left + 1);
                int new_pivot_index = partition(nums, left, right, pivot_index);
                if (new_pivot_index == nums.length - k) {
                    return nums[new_pivot_index];
                } else if (new_pivot_index > nums.length - k) {
                    right = new_pivot_index - 1;
                } else {
                    left = new_pivot_index + 1;
                }
            }
        }

        private static int partition(int[] nums, int left, int right, int pivot_index) {
            int pivot = nums[pivot_index];
            swap(nums, pivot_index, right);
            int stored_index = left;
            for (int i = left; i < right; i++) {
                if (nums[i] < pivot) {
                    swap(nums, i, stored_index);
                    stored_index++;
                }
            }
            swap(nums, right, stored_index);
            return stored_index;
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

