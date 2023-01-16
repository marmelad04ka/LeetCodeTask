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
}
