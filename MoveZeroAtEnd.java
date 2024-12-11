// move zero to end
// hint :- approach index tracking

import java.util.Arrays;

public class MoveZeroAtEnd {
    static void getNewList(int arrList[],int n){
        int index = 0;// index to place next non -zero index
        for(int i =0; i <n; i++){
            if(arrList[i] != 0){
                arrList[index ++] = arrList[i];
            }
        }
        // fill the remaining 
        while (index < n) {
            arrList[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int arrList [] ={4,7,8,0,0,9,12,0,0,0};
        int n = arrList.length;
        System.out.println("Original array: " + Arrays.toString(arrList));
        getNewList(arrList,n);
                System.out.println("Array after moving zeroes: " + Arrays.toString(arrList));

    }
}
