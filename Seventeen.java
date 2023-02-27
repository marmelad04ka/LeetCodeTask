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
}
