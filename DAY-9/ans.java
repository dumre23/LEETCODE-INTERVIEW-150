public class ans {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
     int i = m - 1;
     int j = n - 1;
     int k = n + m - 1;
     while(j>=0) {
        if(i < 0 || nums1[i] <= nums2[j]){
            nums1[k--] = nums2[j--]; 
        }else{
            nums1[k--] = nums1[i--];
        }
     }   
    }

    public static void main(String[] args) {
        ans solution = new ans();
        int[] nums1 = new int[6];
        int[] nums2 = {2, 5, 6};
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        solution.merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
