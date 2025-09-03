  //import java.util.*;
  public class ans {
  
   // Set<Integer> uq = new LinkedHashSet<>();

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int j = 1;
        for(int i=1; i< n ; i++) {
            if(nums[i] != nums[j-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j ;

                        // If_handed unsorted list of elements : 

    //     for(int num : nums) {
    //         uq.add(num);
    //     }
        
    //     int k = 0;
    //    for( int num : uq) {
    //     nums[k++] = num;
    //    }
    //    return k;
    
    }
}

