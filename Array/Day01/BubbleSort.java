public class BubbleSort {
    public static void printArray(int arr []) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        // time complextity 0(n62)
        for (int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;i++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
