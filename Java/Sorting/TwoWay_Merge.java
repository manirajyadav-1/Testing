public class TwoWay_Merge {
    static void merge(int arr[], int left[], int right[], int leftsize, int rightsize) {
        int i = 0, j = 0, k = 0;

        while (i < leftsize && j < rightsize) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftsize) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightsize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    static void mergesort(int arr[], int n) {
        if (n <= 1) {
            return;
        }
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
        }

        mergesort(left, mid);
        mergesort(right, n - mid);
        merge(arr, left, right, mid, n - mid);

    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 8, 6, 2, 7, 1, 4 };
        int n = arr.length;
        mergesort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
