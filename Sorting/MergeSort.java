public class MergeSort{
    public static void divide(int[] arr, int left, int right){
        if(left<right){
            int mid = left + (right - left)/2;
            divide(arr, left, mid);
            divide(arr, mid+1, right);
            conquer(arr, left , mid, right);
        }
    }


    public static void conquer(int[] arr, int l, int m, int r){
        int leftSize = m - l+1;
        int rightSize = r - m;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for(int i=0; i<leftSize; i++){
            left[i] = arr[l+i];
        }
        for(int i=0; i<rightSize; i++){
            right[i] = arr[m+1+i];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        for(; i<leftSize; i++){
            arr[k] = left[i];
            k++;
        }
        for(; j<rightSize; j++){
            arr[k] = right[j];
            k++;
        }
    }


    public static void main(String[] args){


        int[] arr = {7,3,6,2,9,4,10,4,-5};
        divide(arr, 0, arr.length - 1);
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}