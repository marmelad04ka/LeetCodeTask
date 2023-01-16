import java.math.BigInteger;
import java.util.Arrays;

public class One {
    //1. Two Sum
    //https://leetcode.com/problems/two-sum/
    public int[] twoSum(int[] nums, int target) {
        int[] timeLess = new int[2];
        int[] newArr = null;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            count = target - nums[i];
            newArr = new int[nums.length - 1];
            for(int index = 0; index < i; index++) newArr[index] = nums[index];
            for(int d = i; d < nums.length - 1; d++) newArr[d] = nums[d + 1];

            for(int j = 0; j < newArr.length; j++){
                if(newArr[j] == count){
                    timeLess[0] = i;
                    timeLess[1] = j;
                }
            }
        }
        return timeLess;
    }

    //9. Palindrome Number
    //https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String rts = new StringBuffer(str).reverse().toString();
        return str.equals(rts);
    }

    //13. Roman to Integer
    //https://leetcode.com/problems/roman-to-integer/
    public int romanToInt(String s) {
        String[] romanStr = s.split("");
        int nums = 0;
        for(int i = 0; i < romanStr.length; i++){
            if(i != romanStr.length - 1 && romanStr[i].equals("I") && romanStr[i + 1].equals("V")){
                nums += 4;
                i += 1;
                continue;
            }
            if(i != romanStr.length - 1 && romanStr[i].equals("I") && romanStr[i + 1].equals("X")){
                nums += 9;
                i += 1;
                continue;
            }
            if(i != romanStr.length - 1 && romanStr[i].equals("X") && romanStr[i + 1].equals("L")){
                nums += 40;
                i += 1;
                continue;
            }
            if(i != romanStr.length - 1 && romanStr[i].equals("X") && romanStr[i + 1].equals("C")){
                nums += 90;
                i += 1;
                continue;
            }
            if(i != romanStr.length - 1 && romanStr[i].equals("C") && romanStr[i + 1].equals("D")){
                nums += 400;
                i += 1;
                continue;
            }
            if(i != romanStr.length - 1 && romanStr[i].equals("C") && romanStr[i + 1].equals("M")){
                nums += 900;
                i += 1;
                continue;
            }
            if(romanStr[i].equals("X")){
                nums += 10;
                continue;
            }
            if(romanStr[i].equals("L")){
                nums += 50;
                continue;
            }
            if(romanStr[i].equals("C")){
                nums += 100;
                continue;
            }
            if(romanStr[i].equals("D")){
                nums += 500;
                continue;
            }
            if(romanStr[i].equals("M")){
                nums += 1000;
                continue;
            }
            if(romanStr[i].equals("I")){
                nums += 1;
                continue;
            }
            if(romanStr[i].equals("V")){
                nums += 5;
            }
        }
        return nums;
    }

    //14. Longest Common Prefix
    //https://leetcode.com/problems/longest-common-prefix/
    public String longestCommonPrefix(String[] strs) {
        String[] wordArr = strs[0].split("");
        String str2 = "";
        int num = 0;
        for(int i = 0; i < wordArr.length; i++){
            for(int j = 0; j < strs.length; j++){
                if(strs[j].startsWith(wordArr[i])){
                    num++;
                    strs[j] = strs[j].replaceFirst(wordArr[i], "");
                }
            }
            if(num != strs.length) break;
            if(num == strs.length) str2 += wordArr[i];
            num = 0;
        }
        return str2;
    }

    //35. Search Insert Position
    //https://leetcode.com/problems/search-insert-position/
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]) return i;
            index = - 1;
        }
        if(index == - 1){
            if(target > Arrays.stream(nums).max().getAsInt()) return nums.length;
            if(target < Arrays.stream(nums).min().getAsInt()) return 0;
            for(int i = 0; i < nums.length; i++) if(target > nums[i] && target < nums[i + 1]) return i + 1;
        }
        return index;
    }

    //58. Length of Last Word
    //https://leetcode.com/problems/length-of-last-word/
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (String value : strArr) {
            if (value.equals("")) continue;
            str.append(value).append(" ");
        }
        String[] strArr1 = str.toString().split(" ");
        for(int i = 0; i < strArr1.length; i++) if(i == strArr1.length - 1) return strArr1[i].length();
        return 0;
    }

    //66. Plus One
    //https://leetcode.com/problems/plus-one/
    public int[] plusOne(int[] digits) {
        String str = Arrays.toString(digits).replaceAll("[\\[\\], ]", "");
        System.out.print(str);
        BigInteger num1 = new BigInteger(str);
        num1 = num1.add(BigInteger.valueOf(1));
        String str2 = String.valueOf(num1);
        int[] arr1 = str2.chars()
                .map(x -> x - '0')
                .toArray();
        System.out.print(Arrays.toString(arr1));
        return  arr1;
    }

    //69. Sqrt(x)
    //https://leetcode.com/problems/sqrtx/
    public int mySqrt(int x) {
        int count = x, y = 1;
        for(int i = 0; i < x; i++){
            count = count - y;
            y += 2;
            if(count == 0 || count < y) return i + 1;
        }
        return count;
    }

    //70. Climbing Stairs
    //https://leetcode.com/problems/climbing-stairs/
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int fib1 = 1,  fib2 = 1, i = 0, fib_sum = 0;
        while (i < n - 1) {
            fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
            i +=  1;
        }
        return fib_sum;
    }

    //125. Valid Palindrome
    //https://leetcode.com/problems/valid-palindrome/
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String firstHalf = str.substring(0, str.length()/2), secondHalf = "";
        if(str.length()%2 == 0){
            secondHalf = String.valueOf(new StringBuffer(str.substring(str.length()/2)).reverse());}
        else {
            secondHalf = String.valueOf(new StringBuffer(str.substring(str.length()/2 + 1)).reverse());}
        return firstHalf.equals(secondHalf);
    }
}
