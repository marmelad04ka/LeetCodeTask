import java.util.Arrays;

public class Ten {
    //2413. Smallest Even Multiple
    //https://leetcode.com/problems/smallest-even-multiple/
    public int smallestEvenMultiple(int n) {
        if(n == 1) return 2;
        for(int i = n; i < n * n; i++){
            if(i%n == 0 && i%2 == 0) return i;
        }
        return -1;
    }

    //2427. Number of Common Factors
    //https://leetcode.com/problems/number-of-common-factors/
    public int commonFactors(int a, int b) {
        int min = Math.min(a, b), count = 0;
        for(int i = 1; i <= min; i++){
            if(a%i == 0 && b%i == 0) count++;
        }
        return count;
    }

    //2455. Average Value of Even Numbers That Are Divisible by Three
    //https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
    public int averageValue(int[] nums) {
        int upAvg = Arrays.stream(nums).filter(x -> x%2 == 0 && x%3 == 0).sum();
        int lowAvg = (int) Arrays.stream(nums).filter(x -> x%2 == 0 && x%3 == 0).count();
        if(lowAvg == 0) return 0;
        int fullAvg = upAvg / lowAvg;
        return fullAvg;
    }

    //2469. Convert the Temperature
    //https://leetcode.com/problems/convert-the-temperature/
    public double[] convertTemperature(double celsius) {
        double[] convertTemp = new double[2];
        convertTemp[0] = celsius + 273.15;
        convertTemp[1] = (celsius * 9/5) + 32;
        return convertTemp;
    }

    //2485. Find the Pivot Integer
    //https://leetcode.com/problems/find-the-pivot-integer/
    public int pivotInteger(int n) {
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = i + 1;

        for(int i = 0; i < arr.length; i++){
            int first = Arrays.stream(arr, 0 ,i+1).sum();
            int second = Arrays.stream(arr, i, arr.length).sum();
            if(first == second) return arr[i];
        }
        return -1;
    }

    //2496. Maximum Value of a String in an Array
    //https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0; i < strs.length; i++){
            String str = "";
            str = strs[i].replaceAll("[a-zA-Z]", "");
            if(str.length() != strs[i].length()){
                if(strs[i].length() > max) max = strs[i].length();
            }
            else if(Integer.parseInt(str) > max) max = Integer.parseInt(strs[i]);
        }
        return max;
    }

    //2520. Count the Digits That Divide a Number
    //https://leetcode.com/problems/count-the-digits-that-divide-a-number/
    public int countDigits(int num) {
        int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) if(num%arr[i] == 0) count++;
        return count;
    }

    //2529. Maximum Count of Positive Integer and Negative Integer
    //https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
    public int maximumCount(int[] nums) {
        int positiveCount = (int) Arrays.stream(nums).filter(x -> x > 0).count();
        int negativeCount = (int) Arrays.stream(nums).filter(x -> x < 0).count();
        return positiveCount > negativeCount? positiveCount:negativeCount;
    }

    //2535. Difference Between Element Sum and Digit Sum of an Array
    //https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
    public int differenceOfSum(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int sumSmall = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 9){
                sumSmall += digit(nums[i]);
                continue;
            }
            sumSmall += nums[i];
        }
        return sum - sumSmall;
    }
    public static int digit(int n){
        int sum = 0;
        for(; n != 0; n /= 10) sum += (n % 10);
        return sum;
    }

    //338. Counting Bits
    //https://leetcode.com/problems/counting-bits/description/
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        final char ch = '1';
        for(int i = 0; i <= n; i++){
            arr[i] = (int) Integer.toBinaryString(i).chars().filter(x -> x == ch).count();
        }
        return arr;
    }
}
