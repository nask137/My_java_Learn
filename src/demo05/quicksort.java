package demo05;

public class quicksort {
    public static void main(String[] args) {
        int[]arr={6,3,10,7,2,5,2,12,556,66,55,5,0,7,23,52,89,110,262,5,0,5,12,5,2,6,5,51,50,5,5,15,5,15,1,4,1,};
        quicksort(arr,0,arr.length-1);
        for (int j : arr) {
            System.out.println(j);
        }

    }
    static void quicksort(int[]arr,int a,int b) {
        if (a <= b) {
            int start = a, end = b;
            int pointnumber = arr[a];
            while (start != end) {
                while (start < end && arr[end] > pointnumber) {
                    end--;
                }
                while (start < end && arr[start] <= pointnumber) {
                    start++;
                }
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;

            }
            int temp = arr[start];
            arr[start] = arr[a];
            arr[a] = temp;
            quicksort(arr, a, start - 1);
            quicksort(arr, start + 1, b);
        }


    }
}
