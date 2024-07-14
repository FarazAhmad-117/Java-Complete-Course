
public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {2, 34, 13, 6, 52, 7, 19, 33};
        
        // Selection sort 
        for(int i = 0; i < arr.length - 1; i++) {
            int smallestIdx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }

        // Printing the final array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}