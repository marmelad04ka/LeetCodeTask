import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Three {
    //345. Reverse Vowels of a String
    //https://leetcode.com/problems/reverse-vowels-of-a-string/
    public String reverseVowels(String s) {
        String[] onlyVowles = new StringBuffer(s.replaceAll("[^aeiouAEIOU]", "")).reverse().toString().split("");
        String[] fullWords = s.split("");
        int count = 0;
        for(int i = 0; i < fullWords.length; i++){
            for(int j = 0; j < onlyVowles.length; j++){
                if(fullWords[i].equals(onlyVowles[j])){
                    fullWords[i] = onlyVowles[count];
                    count++;
                    break;
                }
            }
        }
        return String.join("", fullWords);
    }

    //367. Valid Perfect Square
    //https://leetcode.com/problems/valid-perfect-square/
    public boolean isPerfectSquare(int num) {
        return mySqrt(num) * mySqrt(num) == num;
    }
    public int mySqrt(int x) {
        int count = x, y = 1;
        for(int i = 0; i < x; i++){
            count = count - y;
            y += 2;
            if(count == 0 || count < y) return i + 1;
        }
        return count;
    }

    //387. First Unique Character in a String
    //https://leetcode.com/problems/first-unique-character-in-a-string/
    public int firstUniqChar(String s) {
        String str = Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
        String[] str1 = str.split("");
        String s1 = s;
        for(int i = 0; i < str1.length; i++){
            s1 = s1.replaceAll(str1[i], "");
            System.out.println(s1);
            if(s.length() - s1.length() == 1) return s.indexOf(str1[i]);
            s1 = s;
        }
        return -1;
    }

    //389. Find the Difference
    //https://leetcode.com/problems/find-the-difference/
    public char findTheDifference(String s, String t) {
        if(s.equals("")) return t.charAt(0);
        String[] strArr1 = s.split(""), strArr2 = t.split("");
        int num1 = 0, num2 = 0;
        for(int i = 0; i < strArr1.length; i++) num1 = (int) strArr1[i].charAt(0) + num1;
        for(int j = 0; j < strArr2.length; j++) num2 = (int) strArr2[j].charAt(0) + num2;
        return (char) ((char) num2 - num1);
    }

    //412. Fizz Buzz
    //https://leetcode.com/problems/fizz-buzz/
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5 == 0)
                list.add("FizzBuzz");
            else if(i%3==0)
                list.add("Fizz");
            else if(i%5==0)
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }

        return list;
    }

    //414. Third Maximum Number
    //https://leetcode.com/problems/third-maximum-number/
    public int thirdMax(int[] nums) {
        int one = Arrays.stream(nums).max().getAsInt();
        int two = 0;
        if(Arrays.stream(nums).distinct().toArray().length > 1) two = Arrays.stream(nums).filter(x -> x != one).max().getAsInt();
        int three = 0, trueTwo = two;;
        if(Arrays.stream(nums).distinct().toArray().length > 2) return three = Arrays.stream(nums).filter(x -> x != one && x != trueTwo).max().getAsInt();
        return one;
    }

    //434. Number of Segments in a String
    //https://leetcode.com/problems/number-of-segments-in-a-string/
    public int countSegments(String s) {
        if(s.equals("")) return 0;
        String[] strArr = s.split(" ");
        int count = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("")) continue;
            count++;
        }
        return count;
    }

    //476. Number Complement
    //https://leetcode.com/problems/number-complement/
    public int findComplement(int num) {
        String[] strArr = Integer.toString(num, 2).split("");
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("1")){
                strArr[i] = "0";
                continue;
            }
            if(strArr[i].equals("0")) strArr[i] = "1";
        }
        return Integer.parseInt(String.join("", strArr), 2);
    }

    //482. License Key Formatting
    //https://leetcode.com/problems/license-key-formatting/
    public String licenseKeyFormatting(String s, int k) {
        String str1 = new StringBuffer(s.replaceAll("[-]", "").toUpperCase()).reverse().toString();
        String[] arr = str1.split("");
        int j = 0;
        for(int i = k; i < arr.length; i+= k){
            str1 = new StringBuffer(str1).insert(i + j, "-").toString();
            j++;
        }
        String result = new StringBuffer(str1).reverse().toString();
        return result;
    }

    //485. Max Consecutive Ones
    //https://leetcode.com/problems/max-consecutive-ones/
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] arr = new int[nums.length + 1];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        arr[arr.length - 1] = 0;

        int count = 0, max = 0;
        for(int i = 0; i < arr.length; i++){
            count++;
            if(arr[i] == 0){
                if(count > max) max = count;
                count = 0;
            }
        }
        return max - 1;
    }
}
