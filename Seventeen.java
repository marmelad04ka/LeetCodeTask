import java.util.Arrays;
import java.util.stream.IntStream;

public class Seventeen {
    //4. Median of Two Sorted Arrays
    //https://leetcode.com/problems/median-of-two-sorted-arrays/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(arr);
        if(arr.length%2 == 1) return arr[arr.length/2];
        else return ((double) arr[arr.length/2] + (double) arr[arr.length/2 - 1]) / 2;
    }

    //2396. Strictly Palindromic Number
    //https://leetcode.com/problems/strictly-palindromic-number/description/
    public boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <= n - 2; i++){
            System.out.println(Integer.toString(n, i));
            String str = Integer.toString(n, i);
            if(!isPalindrome(str)) return false;
        }
        return true;
    }
    public static boolean isPalindrome(String x) {
        String rts = new StringBuffer(x).reverse().toString();
        return x.equals(rts);
    }
}
