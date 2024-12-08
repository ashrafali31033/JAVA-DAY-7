public class array3 {
    public static int[] findPairWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if no pair is found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int[] result = findPairWithSum(arr, target);
        if (result[0] != -1) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}