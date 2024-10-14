//Learning selection sorting.
//Works by finding max or min value and sorting it, creating 2 sections of an array; sorted and unsorted.

public class selectionSort{
    public static void main(String[] args) {
        int nums[] = {10,9,8,7,6,5,4,3,2,1};
        selectSortMin(nums);

        // int nums2[] = {0,1,7,3,67,9,45,3,1,4,6,8,9,5,23,2};
        // selectSortMax(nums2);
    }

    public static int[] selectSortMin(int[] arr){

        int size = arr.length;
        int minIndex = -1;
        int temp = 0;
        int steps = 0;

        //Print the array before we sort it
        System.out.println("Before min sorting");
        for (int num : arr) 
        {
            System.out.print(num + "  ");
        }

        for (int i = 0; i < size-1; i++) 
        {   steps++;
            minIndex = i;
            for (int j = i+1; j < size; j++) 
            {   steps++;
                if (arr[minIndex] > arr[j]) 
                {
                    steps++;
                    minIndex = j;   
                }
            }
            steps++;
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


        System.out.println("");
        System.out.println("After min sorting");

        for (int num : arr) 
        {
            System.out.print(num + "  ");
        }
        System.out.println("");
        System.out.println("Size of array: " + size);
        System.out.println("Steps: " + steps);
        System.out.println();

        return arr;
    }

    // public static int[] selectSortMax(int[] arr){

    //     int size = arr.length;
    //     int maxIndex = size + 1;
    //     int temp = 0;

    //     //Print the array before we sort it
    //     System.out.println("Before max sorting");
    //     for (int num : arr) 
    //     {
    //         System.out.print(num + "  ");
    //     }

    //     for (int i = 0; i < size-1; i++) 
    //     {
    //         maxIndex = i;
    //         for (int j = i+1; j < size; j++) 
    //         {
    //             if (arr[maxIndex] > arr[j]) 
    //             {
    //                 maxIndex = j;   
    //             }
    //         }

    //         temp = arr[maxIndex];
    //         arr[maxIndex] = arr[i];
    //         arr[i] = temp;
    //     }


    //     System.out.println("");
    //     System.out.println("After max sorting");

    //     for (int num : arr) 
    //     {
    //         System.out.print(num + "  ");
    //     }
    //     System.out.println("");
    //     System.out.println("Size of array: " + size);
    //     System.out.println();

    //     return arr;
    // }
}