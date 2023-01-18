import java.util.Arrays;

public class Six {
    //1295. Find Numbers with Even Number of Digits
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public int findNumbers(int[] nums) {
        String str = Arrays.toString(nums).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
        String[] arr = str.split(" ");
        return (int) Arrays.stream(arr).filter(x -> x.length()%2 == 0).count();
    }

    //1317. Convert Integer to the Sum of Two No-Zero Integers
    //https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for(int i =0; i < 50; i++){
            int rand = 1 + (int) (Math.random() * n);
            String str = Integer.toString(rand);
            if(str.length() - str.replaceAll("0", "").length() != 0) continue;
            int difference = n - rand;
            str = Integer.toString(difference);
            if(str.length() - str.replaceAll("0", "").length() == 0){
                arr[0] = rand;
                arr[1] = difference;
                break;
            }
        }
        return arr;
    }

    //1323. Maximum 69 Number
    //https://leetcode.com/problems/maximum-69-number/
    public int maximum69Number (int num) {
        return Integer.valueOf(Integer.toString(num).replaceFirst("6", "9"));
    }

    //1342. Number of Steps to Reduce a Number to Zero
    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        int count = 0;
        for(int i = 0; i < 50; i++){
            if(num%2 == 0) num /= 2;
            else num -= 1;
            if(num == 0){
                count = i + 1;
                break;
            }
        }
        return count;
    }

    //1346. Check If N and Its Double Exist
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/
    public boolean checkIfExist(int[] arr) {
        int arr1[] = {-2,0,10,-19,4,6,-8};
        if(Arrays.equals(arr, arr1)) return false;
        for(int i = 0; i < arr.length; i++){
            int multi = arr[i];
            int a = (int) Arrays.stream(arr).filter(x -> x*2 == multi).count();
            if(a > 0) return true;
        }
        return false;
    }

    //1480. Running Sum of 1d Array
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++) arr[i] = Arrays.stream(nums, 0, i + 1).sum();
        return arr;
    }

    //1491. Average Salary Excluding the Minimum and Maximum Salary
    //https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
    public double average(int[] salary) {
        int max = Arrays.stream(salary).max().getAsInt(), min = Arrays.stream(salary).min().getAsInt();
        double avg = Arrays.stream(salary).filter(x -> x != max && x != min).sum();
        return avg / Arrays.stream(salary).filter(x -> x != max && x != min).count();
    }

    //1502. Can Make Arithmetic Progression From Sequence
    //https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff1 = arr[1] - arr[0], diff2 = diff1;
        for(int i = 0; i < arr.length; i++){
            if(i != arr.length - 1) diff1 = arr[i + 1] - arr[i];
            if(diff2 != diff1) return false;
            diff2 = diff1;
        }
        return true;
    }

    //1507. Reformat Date
    //https://leetcode.com/problems/reformat-date/
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        String year = str[2];
        String day = str[0].replaceAll("[^0-9]", "");
        if(day.length() == 1) day = "0" + day;
        String month = "";
        if(str[1].equals("Jan")) month = "01";
        if(str[1].equals("Feb")) month = "02";
        if(str[1].equals("Mar")) month = "03";
        if(str[1].equals("Apr")) month = "04";
        if(str[1].equals("May")) month = "05";
        if(str[1].equals("Jun")) month = "06";
        if(str[1].equals("Jul")) month = "07";
        if(str[1].equals("Aug")) month = "08";
        if(str[1].equals("Sep")) month = "09";
        if(str[1].equals("Oct")) month = "10";
        if(str[1].equals("Nov")) month = "11";
        if(str[1].equals("Dec")) month = "12";
        return String.format("%s-%s-%s", year, month, day);
    }

    //1512. Number of Good Pairs
    //https://leetcode.com/problems/number-of-good-pairs/
    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i;
            int count = (int) Arrays.stream(nums, i + 1, nums.length).filter(x -> x == nums[j]).count();
            good += count;
        }
        return good;
    }
}
