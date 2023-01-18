import java.util.Arrays;

public class Five {
    //724. Find Pivot Index
    //https://leetcode.com/problems/find-pivot-index/
    public int pivotIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int first = Arrays.stream(nums, 0 ,i).sum();
            int second = Arrays.stream(nums, i + 1, nums.length).sum();
            if(first == second) return i;
        }
        return -1;
    }

    //744. Find Smallest Letter Greater Than Target
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++) if((int) letters[i] > target) return letters[i];
        return letters[0];
    }

    //747. Largest Number At Least Twice of Others
    //https://leetcode.com/problems/largest-number-at-least-twice-of-others/
    public int dominantIndex(int[] nums) {
        int maxNum = Arrays.stream(nums).max().getAsInt(), count = 0;
        for(int i = 0; i < nums.length; i++) if(nums[i] != maxNum && nums[i] * 2 > maxNum) return -1;
        for(int i = 0 ; i<nums.length; i++) if(nums[i] == maxNum) return i;
        return -1;
    }

    //771. Jewels and Stones
    //https://leetcode.com/problems/jewels-and-stones/
    public int numJewelsInStones(String jewels, String stones) {
        String[] str = jewels.split("");
        String newStr = stones;
        for(int i = 0; i < str.length; i++) newStr = newStr.replaceAll(str[i], "");
        return stones.length() - newStr.length();
    }

    //844. Backspace String Compare
    //https://leetcode.com/problems/backspace-string-compare/
    public boolean backspaceCompare(String s, String t) {
        String strS = s.replaceAll("[^#]", ""), strT = t.replaceAll("[^#]", "");
        for(int i = 0; i < strS.length(); i++){
            int index = s.indexOf("#");
            if(index == 0) {
                s = s.replaceFirst("#", "");
                continue;
            }
            s = new StringBuffer(s).delete(index - 1, index + 1).toString();
        }
        for(int i = 0; i < strT.length(); i++){
            int index = t.indexOf("#");
            if(index == 0) {
                t = t.replaceFirst("#", "");
                continue;
            }
            t = new StringBuffer(t).delete(index - 1, index + 1).toString();
        }
        return s.equals(t);
    }

    //896. Monotonic Array
    //https://leetcode.com/problems/monotonic-array/
    public boolean isMonotonic(int[] nums) {
        int biggest = 1, smallest = 1;
        for(int i = 0; i < nums.length; i++){
            if(i != nums.length - 1 && nums[i + 1] > nums[i] || i != nums.length - 1 && nums[i + 1] == nums[i]) biggest++;
            if(i != nums.length - 1 && nums[i + 1] < nums[i] || i != nums.length - 1 && nums[i + 1] == nums[i]) smallest++;
        }
        return biggest == nums.length || smallest == nums.length;
    }

    //1051. Height Checker
    //https://leetcode.com/problems/height-checker/
    public int heightChecker(int[] heights) {
        int[] arr1 = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr1);
        int count = 0;
        for(int i = 0; i < heights.length; i++) if(heights[i] != arr1[i]) count++;
        return count;
    }

    //1108. Defanging an IP Address
    //https://leetcode.com/problems/defanging-an-ip-address/
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[.]");
    }

    //1207. Unique Number of Occurrences
    //https://leetcode.com/problems/unique-number-of-occurrences/
    public boolean uniqueOccurrences(int[] arr) {
        int[] newArr = Arrays.stream(arr).distinct().toArray();
        String str = "";
        for(int i = 0; i < newArr.length; i++){
            int j = i;
            str += Integer.toString((int) Arrays.stream(arr).filter(x -> x == newArr[j]).count()) + ",";
        }
        int[] numArr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        return numArr.length - Arrays.stream(numArr).distinct().toArray().length == 0;
    }

    //1281. Subtract the Product and Sum of Digits of an Integer
    //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
    public int subtractProductAndSum(int n) {
        return Arrays.stream(Integer.toString(n).chars().map(c -> c - '0').toArray()).reduce((left, right) -> left * right).getAsInt() - Arrays.stream(Integer.toString(n).chars().map(c -> c - '0').toArray()).sum();
    }
}
