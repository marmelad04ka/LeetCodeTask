import java.util.Arrays;

public class Two {
    //136. Single Number
    //https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int num = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1 && nums[i] != nums[i - 1] || i == 0 && nums[i] != nums[i + 1]) return nums[i];
            if(i != nums.length - 1 && i != 0 && nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) return nums[i];
        }
        return num;
    }

    //169. Majority Element
    //https://leetcode.com/problems/majority-element/
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int count = 1, count1 = 0, majorEle = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i == nums.length - 1) continue;
            if(nums[i] == nums[i + 1]) count++;
            else count = 1;
            if(count > count1) {
                count1 = count;
                majorEle = nums[i];
            }
        }
        return majorEle;
    }

    //202. Happy Number
    //https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        long num = n;
        for(int i = 0; i < num*5; i++){
            int[] arr = Integer.toString((int)num).chars().map(c -> c - '0').toArray();
            num = Arrays.stream(arr).map(x -> x*x).sum();
            if(num == 1) return true;
            if(num == 145) return false;
        }
        return true;
    }

    //217. Contains Duplicate
    //https://leetcode.com/problems/contains-duplicate/
    public boolean containsDuplicate(int[] nums) {
        int b = nums.length - Arrays.stream(nums).distinct().toArray().length;
        return b != 0;
    }

    //231. Power of Two
    //https://leetcode.com/problems/power-of-two/
    public boolean isPowerOfTwo(int n) {

        long count =  n;
        if(n == 1 || n == 2) return true;
        if(n%2 == 1) return false;
        for(int i = 0; i < n/2; i++){
            count /= 2;
            if(count%2 == 1) return false;
            if(count == 2)  return true;
        }
        return false;
    }

    //242. Valid Anagram
    //https://leetcode.com/problems/valid-anagram/
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray(), ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    //258. Add Digits
    //https://leetcode.com/problems/add-digits/
    public int addDigits(int num) {
        int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int count = 0;
        for(int i = 0; i < arr.length + 1; i++){
            count = Arrays.stream(arr).sum();
            arr = Integer.toString(count).chars().map(c -> c - '0').toArray();
        }
        return count;
    }

    //268. Missing Number
    //https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < nums.length){
                if(i == nums.length - 1 || nums[i + 1] - nums[i] != 1) return nums[i] + 1;
            } else if(nums[i] == nums.length) return 0;
        }
        return 0;
    }

    //342. Power of Four
    //https://leetcode.com/problems/power-of-four/
    public boolean isPowerOfFour(int n) {
        float count = n;
        if(n == 4 || n == 1) return true;
        for(int i = 0; i < n/8; i++){
            count /= 4;
            if(count%1 == 1 || count < 1) return false;
            if(count == 4) return true;
        }
        return false;
    }

    //344. Reverse String
    //https://leetcode.com/problems/reverse-string/
    public void reverseString(char[] s) {
        s = new StringBuffer(String.valueOf(s)).reverse().toString().toCharArray();
    }
}
