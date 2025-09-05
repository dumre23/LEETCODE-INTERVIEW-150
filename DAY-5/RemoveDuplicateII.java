public class RemoveDuplicateII {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 0;
         
        for(int i = 0 ; i< nums.length ; i++) {
            if(i < 2 ) {
                nums[k++] = nums[i];
            }
                else if(nums[i] != nums[j]) {
                    nums[k++] = nums[i];
                    j++;
                }
        }
        return k ;
    }

    public static void main(String args[]) {
        RemoveDuplicateII obj = new RemoveDuplicateII();
        int arr[] = {1,1,1,2,2,3};
        int k = obj.removeDuplicates(arr);
        System.out.println(k);
        for(int i = 0 ; i< k ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
