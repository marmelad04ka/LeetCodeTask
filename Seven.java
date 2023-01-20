import java.util.Arrays;

public class Seven {
    //1556. Thousand Separator
    //https://leetcode.com/problems/thousand-separator/
    public String thousandSeparator(int n) {
        String str =  new StringBuffer(Integer.toString(n)).reverse().toString();
        int c = 3;
        for(int i = 0; i < str.length()/3; i++){
            str = new StringBuffer(str).insert(c, ".").toString();
            c += 4;
            if(c > str.length()) break;
        }
        char firstPoint = str.charAt(str.length() - 1);
        if(firstPoint == '.') return str = new StringBuffer(str).reverse().toString().replaceFirst("\\.", "");
        return new StringBuffer(str).reverse().toString();
    }

    //1629. Slowest Key
    //https://leetcode.com/problems/slowest-key/
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        String[] strArr = keysPressed.split("");
        int[] arr = new int[releaseTimes.length];
        arr[0] = releaseTimes[0];
        for(int i = 1; i < releaseTimes.length; i++) arr[i] = releaseTimes[i] - releaseTimes[i - 1];
        int max = Arrays.stream(arr).max().getAsInt();
        String str = "";
        for(int i = 0; i < arr.length; i++) if(arr[i] == max) str += strArr[i];
        strArr = str.split("");
        Arrays.sort(strArr);
        return String.join("", strArr).charAt(strArr.length - 1);
    }

    //1662. Check If Two String Arrays are Equivalent
    //https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1), str2 = String.join("", word2);
        return str1.equals(str2);
    }

    //1678. Goal Parser Interpretation
    //https://leetcode.com/problems/goal-parser-interpretation/
    public String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(","").replaceAll("\\)", "");
    }

    //1684. Count the Number of Consistent Strings
    //https://leetcode.com/problems/count-the-number-of-consistent-strings/
    public int countConsistentStrings(String allowed, String[] words) {
        String[] str = allowed.split("");
        int count = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < str.length; j++){
                words[i] = words[i].replaceAll(str[j], "");
            }
            if(words[i].equals("")) count++;
        }
        return count;
    }

    //1688. Count of Matches in Tournament
    //https://leetcode.com/problems/count-of-matches-in-tournament/
    public int numberOfMatches(int n) {
        return n - 1;
    }

    //1704. Determine if String Halves Are Alike
    //https://leetcode.com/problems/determine-if-string-halves-are-alike/
    public boolean halvesAreAlike(String s) {
        String str1 = s.substring(0, s.length()/2).toLowerCase().replaceAll("[^aeiou]", "");
        String str2 = s.substring(s.length()/2, s.length()).toLowerCase().replaceAll("[^aeiou]", "");
        return str1.length() == str2.length();
    }

    //1716. Calculate Money in Leetcode Bank
    //https://leetcode.com/problems/calculate-money-in-leetcode-bank/
    public int totalMoney(int n) {
        int j = 0, count = 0, q = 0;
        for(int i = 1; i <= n; i++){
            j++;
            count += j;
            if(i%7==0) {
                q++;
                j = q;
            }
        }
        return count;
    }

    //1859. Sorting the Sentence
    //https://leetcode.com/problems/sorting-the-sentence/
    public String sortSentence(String s) {
        String[] strArrOld = s.split(" ");
        String[] strArrNew = new String[strArrOld.length];
        for(int i = 0; i < strArrOld.length; i++){
            for(int j = 0; j <= 9; j++) {
                if (strArrOld[i].contains(Integer.toString(j))) strArrNew[j-1] = strArrOld[i];
            }
        }
        return s.length() == 0? "": String.join(" ", strArrNew).replaceAll("[0-9]", "");
    }

    //1869. Longer Contiguous Segments of Ones than Zeros
    //https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
    public boolean checkZeroOnes(String s) {
        String[] onlyOne = s.split("0"), onlyZero = s.split("1");
        int oneMax = 0, zeroMax = 0;
        for(int i = 0; i < onlyOne.length; i++){
            if(onlyOne[i].length() > oneMax) oneMax = onlyOne[i].length();
        }
        for(int i = 0; i < onlyZero.length; i++){
            if(onlyZero[i].length() > zeroMax) zeroMax = onlyZero[i].length();
        }
        return oneMax > zeroMax;
    }

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
}
