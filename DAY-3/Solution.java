class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int k = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String args[]){
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = solution.removeElement(nums, val);  //solution.removeElement use nagarney vaye: removeElement method lai static garaye
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}