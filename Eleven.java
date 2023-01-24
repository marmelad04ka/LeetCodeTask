import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    //728. Self Dividing Numbers
    //https://leetcode.com/problems/self-dividing-numbers/description/
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int count = 0;
            int[] arr = Integer.toString(i).chars().map(c -> c - '0').toArray();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == 0) continue;
                if(i%arr[j] == 0) count++;
            }
            if(count == arr.length) list.add(i);
        }
        return list;
    }

    //657. Robot Return to Origin
    //https://leetcode.com/problems/robot-return-to-origin/description/
    public boolean judgeCircle(String moves) {
        int countLeft = moves.length() - moves.replaceAll("L", "").length();
        int countRight = moves.length() - moves.replaceAll("R", "").length();
        int countUp = moves.length() - moves.replaceAll("U", "").length();
        int countDown = moves.length() - moves.replaceAll("D", "").length();
        return countLeft == countRight && countUp == countDown;
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
}
