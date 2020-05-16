package Array;

/**
 * Given an array of integers A sorted in non-decreasing order,
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * Test case 1:                 Test case 2:
 * Input: [-4,-1,0,3,10]        Input: [-7,-3,2,3,11]
 * Output: [0,1,9,16,100]       Output: [4,9,9,49,121]
 */


public class SquareArray_Rearrange {
    public static void main(String[] args) {
        int[] array = {-7, -3, 2, 3, 11};
        SquareArray_Rearrange getMethod = new SquareArray_Rearrange();

        for (int i : getMethod.sortedSquares(array)) {
            System.out.print("[" + i + "]");
        }

    }

    public int[] sortedSquares(int[] A) {
        int[] newArray = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int tmp = A[i] * A[i];
            newArray[i] = tmp;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                int a = 0;
                if (newArray[i] >= newArray[j]) {
                    a = newArray[j];
                    newArray[j] = newArray[i];
                    newArray[i] = a;
                }
            }
        }

        return newArray;
    }
}
