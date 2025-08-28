//Solution in :
//T.C : O(nlogn)
//S.C : O(1)
import java.util.Arrays;

public class Solution {

    public static int hIndexSolution(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {

            if (citations[i] >= n - i) {
                h = n - i;
                break;
            }

        }

        return h;

    }

    public static void main(String args[]) {

        int citations[] = {3, 0, 6, 1, 5};
        System.out.println(hIndexSolution(citations));
    }
}
