

 class FirstZeroIndex1 {

    static int firstzeroindex(int arr[],int n){
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={1,0,0,0,0};
        int n = arr.length;
        int countElement = firstzeroindex(arr,n);
        if (countElement == -1) {
        }else{
            System.out.println("array count value is "+ countElement); 
            System.out.println(n-countElement);

        }
    }
}