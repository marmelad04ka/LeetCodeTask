import java.util.Arrays;

public class Eleven {
    //349. Intersection of Two Arrays
    //https://leetcode.com/problems/intersection-of-two-arrays/description/
    public int[] intersection(int[] nums1, int[] nums2) {
        nums1 = Arrays.stream(nums1).distinct().toArray();
        nums2 = Arrays.stream(nums2).distinct().toArray();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        String str = "";
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]) str = str + Integer.toString(nums1[i]) + ",";
            }
        }
        if(str.length() == 0) return new int[0];
        String[] strArr = str.split(",");
        int[] arr = new int[strArr.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        return arr;
    }

    //
    //


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //


    //
    //
}
