import java.util.Arrays;

public class Four {
    //500. Keyboard Row
    //https://leetcode.com/problems/keyboard-row/
    public String[] findWords(String[] words) {
        String str = "";
        String[] newArr = words, arr = {};
        for(int i = 0; i < newArr.length; i++){
            if(newArr[i].replaceAll("[qwertyuiopQWERTYUIOP]", "").equals("")){
                str += "," + words[i];
                continue;
            }
            if(newArr[i].replaceAll("[asdfghjklASDFGHJKL]", "").equals("")){
                str += "," + words[i];
                continue;
            }
            if(newArr[i].replaceAll("[zxcvbnmZXCVBNM]", "").equals("")){
                str += "," + words[i];
                continue;
            }
        }
        if (str.equals("")) return arr;
        return newArr = str.substring(1).split(",");
    }

    //504. Base 7
    //https://leetcode.com/problems/base-7/
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }

    //507. Perfect Number
    //https://leetcode.com/problems/perfect-number/
    public boolean checkPerfectNumber(int num) {
        return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;
    }

    //509. Fibonacci Number
    //https://leetcode.com/problems/fibonacci-number/
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] arr = new int[n + 2];
        arr[0] = 0; arr[1] = 1;
        int fib1 = 0, fib2 = 1, fibSum = 0;
        for(int i = 0; i < n; i++){
            fibSum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibSum;
            arr[i + 2] = fibSum;
        }
        return arr[arr.length - 3] + arr[arr.length - 4];
    }

    //520. Detect Capital
    //https://leetcode.com/problems/detect-capital/
    public boolean detectCapitalUse(String word) {
        return word.replaceAll("[A-Z]", "").equals("") || word.replaceAll("[a-z]", "").equals("") || String.valueOf(word.charAt(0)).replaceAll("[A-Z]", "").equals("") && word.substring(1, word.length()).replaceAll("[a-z]","").equals("");
    }

    //541. Reverse String II
    //https://leetcode.com/problems/reverse-string-ii/
    public String reverseStr(String s, int k) {
        String[] strArr = s.split("(?<=\\G.{"+ k +"})");
        for(int i = 0; i < strArr.length; i += 2){
            strArr[i] = new StringBuffer(strArr[i]).reverse().toString();
        }
        return String.join("", strArr);
    }

    //551. Student Attendance Record I
    //https://leetcode.com/problems/student-attendance-record-i/
    public boolean checkRecord(String s) {
        int absent = s.length() - s.replaceAll("[A]","").length();
        String[] strArr = s.replaceAll("[^L]", "_").split("_");
        for(int i = 0; i < strArr.length; i++) if(strArr[i].length() >= 3) return false;
        return  absent < 2;
    }

    //557. Reverse Words in a String III
    //https://leetcode.com/problems/reverse-words-in-a-string-iii/
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        for(int i = 0; i < strArr.length; i++) strArr[i] = new StringBuffer(strArr[i]).reverse().toString();
        return String.join(" ", strArr);
    }

    //575. Distribute Candies
    //https://leetcode.com/problems/distribute-candies/
    public int distributeCandies(int[] candyType) {
        int uniq = (int) Arrays.stream(candyType).distinct().count();
        int half = candyType.length / 2;
        return uniq > half? half: uniq;
    }

    //709. To Lower Case
    //https://leetcode.com/problems/to-lower-case/
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
