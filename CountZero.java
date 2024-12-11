public class CountZero {
    
    static int count(int countInArr[],int n){
        int count = 0;
        for(int i =0; i< n;i++){
            if(countInArr[i] == 0){
                count ++;

            }

        }
        return count;
    }
    public static void main(String[] args) {
        int countInArr[]={1,5,0,7,0,0,8,0,6,0};
        int n = countInArr.length;
        int totalZero = count(countInArr,n);
        System.out.println("zero in array "+ totalZero);
    }
}
