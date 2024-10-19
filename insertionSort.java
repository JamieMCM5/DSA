public class insertionSort {
    public static void main(String[] args) {
        //Declare standard variables
        int[] arr = {5,1,3,2,6,2,1,134};
        int n = arr.length;

        //Iterate over arr, starting from index 1, set the key to the current value, and
        //set j to the index behind the current index
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            //While the value of index j is greater than the key
            while (j>=0 && arr[j] > key) {
                //Shift the value of arr[j] to the next index
                arr[j+1] = arr[j];
                j--;
            }
            //Make the key be the value of the index j+1;
            arr[j+1] = key;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
