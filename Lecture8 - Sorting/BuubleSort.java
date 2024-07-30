
public class BuubleSort {
    public static void main(String[] args) {
        //Sorting an Array;
        int arr[] = {3,4,5,6,7,8,9,12,34,65,2,56};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length - i -1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0 ;i<arr.length ;i++){
            System.out.print(arr[i]+ ", ");
        }

    }

}
