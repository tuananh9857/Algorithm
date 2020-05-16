package Array;

/*
Given a binary array, find the maximum number of consecutive 1s in this array.
Test case 1:             Test case 2:           Test case 3:
Input: [1,1,0,1,1,1]    [1,0,1,1,0,1]           [1]
Output: 3                2                      1
Explanation: The first two digits or the last three digits are consecutive 1s.
The maximum number of consecutive 1s is 3.
 */
public class SumBinary {
    public static void main(String[] args) {
        int [] nums = {0};
        SumBinary getMethod = new SumBinary();
        System.out.println(getMethod.findMaxConsecutiveOnes(nums));

    }
    public int findMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int solve = 0;
        int[] location;
        for (int i : nums){
            if (i == 0){
                count ++;
            }
        }
        ;
        if (count > 0){
            location = new int[count];
        }
        else {
            location = new int[1];
        }
        count = 0;
        for ( int i = 0; i < nums.length; i++){
            if (nums[i] ==0 ){
                location[count] = i;
                count ++;
            }
        }

        count = 0;
        int a = 0;
        int b = 0;
            for ( int i = 0; i < location.length; i ++){
                int tmp = 0;
                for ( int j = count; j < location[i]; j++){
                   tmp += nums[j];
                }
                if ( tmp >= a){
                    a  = tmp;
                }
                count = location[i];
            }
            if (location[location.length-1] < nums.length){
                for ( int i = location[location.length-1]; i < nums.length; i++) {
                    b += nums[i];
                }
            }
            if (a > b){
                solve =a ;
            }
            else {
                solve = b;
            }
        return solve;
    }
}
