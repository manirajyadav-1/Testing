#include<stdio.h>

void merge(int arr[], int l, int m, int r) {
    int i = l, j = m + 1, k = l;
    int b[r - l + 1];

    while (i <= m && j <= r) {
        if (arr[i] < arr[j]) {
            b[k] = arr[i];
            i++;
        }
        else {
            b[k] = arr[j];
            j++;
        }
        k++;
    }

    if (i > m) {
        while (j <= r) {
            b[k] = arr[j];
            j++;
            k++;
        }
    }
    else {
        while (i <= m) {
            b[k] = arr[i];
            i++;
            k++;
        }
    }

    for (k = l; k <= r; k++) {
        arr[k] = b[k];
    }
}

void mergeSort(int arr[], int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int arr[] = {5, 4, 3, 2, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    mergeSort(arr, 0, n - 1);

    printf("Sorted elements are: ");
    printArray(arr, n);
    return 0;
}
