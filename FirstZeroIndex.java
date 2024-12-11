/*Given an array of 1s and 0s which has all 1s first followed by all 0s.
 Find the number of 0s. Count the number of zeroes in the given array. 
 Input: arr[] = {1, 0, 0, 0, 0}
Output: 4
 */
/*public class CountZero {
    public static void main(String[] args) {
        int arr[] ={1,0,0,0,0};
        int count = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i] == 0){
                 count++;

            }
        }
        System.out.println(count);

    }
}*/
// A program to find the number of zeros

class FirstZeroIndex {
    static int firstzeroindex(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1,  1, 1, 0, 0, 0, 0, 0, 0 };
        int n = arr.length;
        int x = firstzeroindex(arr, n);
        if (x == -1) {
        } else {
            System.out.println(x);
        }

    }
}
