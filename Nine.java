import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Nine {
    //2011. Final Value of Variable After Performing Operations
    //https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--")) count--;
            if(operations[i].equals("++X") || operations[i].equals("X++")) count++;
        }
        return count;
    }

    //2057. Smallest Index With Equal Value
    //https://leetcode.com/problems/smallest-index-with-equal-value/
    public int smallestEqual(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i%10 == nums[i]) return i;
        }
        return -1;
    }

    //2089. Find Target Indices After Sorting Array
    //https://leetcode.com/problems/find-target-indices-after-sorting-array/
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]) list.add(i);
        }
        return list;
    }

    //2108. Find First Palindromic String in the Array
    //https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            if(words[i].length()%2 == 1){
                String str1 = words[i].substring(0, words[i].length()/2);
                String str2 = new StringBuffer(words[i].substring(words[i].length()/2 + 1, words[i].length())).reverse().toString();
                if(str1.equals(str2)) return words[i];
            }
            else {
                String str1 = words[i].substring(0, words[i].length()/2);
                String str2 = new StringBuffer(words[i].substring(words[i].length()/2, words[i].length())).reverse().toString();
                if(str1.equals(str2)) return words[i];
            }
        }
        return "";
    }

    //2114. Maximum Number of Words Found in Sentences
    //https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++){
            int maxInside = sentences[i].split(" ").length;
            if(maxInside > max) max = maxInside;
        }
        return max;
    }

    //2119. A Number After a Double Reversal
    //https://leetcode.com/problems/a-number-after-a-double-reversal/
    public boolean isSameAfterReversals(int num) {
        int reversed1 = reversedNum(num);
        int reversed2 = reversedNum(reversed1);
        return num == reversed2;
    }
    public int reversedNum(int nums){
        int reversed = 0;
        while(nums != 0) {
            int digit = nums % 10;
            reversed = reversed * 10 + digit;
            nums /= 10;
        }
        return reversed;
    }

    //2124. Check if All A's Appears Before All B's
    //https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
    public boolean checkString(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        return String.join("",arr).equals(s);
    }

    //2129. Capitalize the Title
    //https://leetcode.com/problems/capitalize-the-title/
    public String capitalizeTitle(String title) {
        String[] arr = title.toLowerCase().split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() < 3) continue;
            String[] arrMini = arr[i].split("");
            arrMini[0] = arrMini[0].toUpperCase();
            arr[i] = String.join("", arrMini);
        }
        return String.join(" ",arr);
    }

    //2169. Count Operations to Obtain Zero
    //https://leetcode.com/problems/count-operations-to-obtain-zero/
    public int countOperations(int num1, int num2) {
        if(num1 == 0 || num2 == 0) return 0;
        int i = 0, a = 0;
        while(i == 0){
            a++;
            if(num1 == num2) return a;
            if(num2 > num1) {
                num2 -= num1;
                continue;
            }
            num1 -= num2;
        }
        return 0;
    }

    //2235. Add Two Integers
    //https://leetcode.com/problems/add-two-integers/
    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
