class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] inputArray = input.split(" ");

        int[] nums = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            nums[i] = Integer.parseInt(inputArray[i]); 
        }

        int k = solution.removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
