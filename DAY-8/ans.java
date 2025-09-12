public class ans {
   
    public int majorityElement(int[] nums) {

                //Mooore's Voting Algm - O(n)

       int count = 0;
       int candidate = 0;
        for(int num: nums) {
            if(count == 0) {
                candidate = num;
                count++;
            }
            else if(num == candidate) {
                count++;
            }else{
                count--;
            }
        }
        return candidate;

                //Approach - 02 : sort & return mid elmt. - O(nlogn)

    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     return nums[n/2];
      
                        //Approach - 03 : Brute force -O(n^2)

    // //     int c ;  //counter for repeatation 
       
    // //     for(int i = 0 ; i< n ; i++) {
    // //         c = 1;
    // //         for(int j = i+1; j< n; j++) {
    // //             if(nums[i] == nums[j]){
    // //                 c++;
    // //             }
    // //         }
    // //         if(c > n/2) {
    // //             return nums[i];
    // //         }
    // //     }
    // //  return -1;
    }
    public static void main(String[] args) {
        ans obj = new ans();
        int[] nums = {3,2,3};
        System.out.println(obj.majorityElement(nums));
    }
}
