package Array;

public class evendigitsNumber {
    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
Input: nums = [12,345,2,6,7896]                                         Input: nums = [555,901,482,1771]
Output: 2                                                               Output: 1
Explanation:                                                            Explanation:
12 contains 2 digits (even number of digits).                           Only 1771 contains an even number of digits.
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
     */
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        evendigitsNumber getSol = new evendigitsNumber();
        System.out.println(getSol.findNumbers(nums));

    }



    public int findNumbers(int[] nums) {
        int sol = 0;
        for (int i : nums){
            int count = 0;
            do{
                i = i/10;
                count ++;
            }while (i >0);
            if ( count % 2 == 0){
                sol ++;
            }

        }

        return sol;
    }
}
