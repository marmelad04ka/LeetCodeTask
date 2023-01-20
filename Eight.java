import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Eight {
    //1876. Substrings of Size Three with Distinct Characters
    //https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
    public int countGoodSubstrings(String s) {
        if(s.length() == 1) return 0;
        int count = 0;
        String str = "";
        String[] strArr = s.split("");
        for(int i = 0; i < strArr.length; i++){
            if(i == strArr.length - 2) break;
            str += strArr[i] + strArr[i + 1] + strArr[i + 2] + ",";
        }
        strArr = str.split(",");
        for(int i = 0; i < strArr.length; i++){
            int a = (int) Arrays.stream(strArr[i].split("")).distinct().count();
            if(strArr[i].length() == a) count++;
        }
        return count;
    }

    //1880. Check if Word Equals Summation of Two Words
    //https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String[] strFirst = firstWord.split(""), stringSecond = secondWord.split(""), stringThird = targetWord.split("");
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder third = new StringBuilder();
        for (String s : strFirst) first.append(Integer.toString((int) s.charAt(0) - 97));
        for (String s : stringSecond) second.append(Integer.toString((int) s.charAt(0) - 97));
        for (String s : stringThird) third.append(Integer.toString((int) s.charAt(0) - 97));
        System.out.print(first + " " + second + " " + third);
        return Integer.parseInt(first.toString()) + Integer.parseInt(second.toString()) == Integer.parseInt(third.toString());
    }

    //1913. Maximum Product Difference Between Two Pairs
    //https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int maxOne = nums[nums.length - 1], maxTwo = nums[nums.length - 2], minOne = nums[0], minTwo = nums[1];
        return maxOne * maxTwo - minOne * minTwo;
    }

    //1929. Concatenation of Array
    //https://leetcode.com/problems/concatenation-of-array/
    public int[] getConcatenation(int[] nums) {
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums2)).toArray();
    }

    //1941. Check if All Characters Have Equal Number of Occurrences
    //https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
    public boolean areOccurrencesEqual(String s) {
        Set<String> set = new HashSet<String>(Arrays.asList(s.split("")));
        String[] result = set.toArray(new String[set.size()]);
        int[] len = new int[result.length];
        for(int i = 0; i < result.length; i++){
            String str1 = s;
            s = s.replaceAll(result[i], "");
            len[i] = str1.length() - s.length();
        }
        int count = (int) Arrays.stream(len).distinct().count();
        return count == 1;
    }

    //1952. Three Divisors
    //https://leetcode.com/problems/three-divisors/
    public boolean isThree(int n) {
        if(n < 2) return false;
        double sq1 = Math.sqrt(n);
        if((int) Math.ceil(sq1%1) == 1) return false;
        int sq = (int) Math.ceil(Math.sqrt(n));
        boolean isTrue = true;
        int temp = 0;
        for (int i = 2; i <= sq / 2; i++) {
            temp = sq % i;
            if (temp == 0) {
                isTrue = false;
                break;
            }
        }
        return isTrue;
    }

    //1967. Number of Strings That Appear as Substrings in Word
    //https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])) count++;
        }
        return count;
    }

    //1979. Find Greatest Common Divisor of Array
    //https://leetcode.com/problems/find-greatest-common-divisor-of-array/
    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt(), min = Arrays.stream(nums).min().getAsInt();
        for(int i = min; i >= 1; i--){
            if(max%i == 0 && min%i == 0) return i;
        }
        return -1;
    }

    //1991. Find the Middle Index in Array
    //https://leetcode.com/problems/find-the-middle-index-in-array/
    public int findMiddleIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int first = Arrays.stream(nums, 0 ,i).sum();
            int second = Arrays.stream(nums, i + 1, nums.length).sum();
            if(first == second) return i;
        }
        return -1;
    }

    //2000. Reverse Prefix of Word
    //https://leetcode.com/problems/reverse-prefix-of-word/
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String str = new StringBuffer(word.substring(0, index + 1)).reverse().toString();
        String str1 = word.substring(index + 1, word.length());
        return str.concat(str1);
    }
}
