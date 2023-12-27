#include <stdio.h>
#define N 4

void mergeArrays(int arr1[], int arr2[], int N1, int N2, int arr3[]) {
    int i = 0, j = 0, k = 0;
    
    while (i < N1 && j < N2) {
        if (arr1[i] < arr2[j])
            arr3[k++] = arr1[i++];
        else
            arr3[k++] = arr2[j++];
    }
    
    while(i < N1)
        arr3[k++] = arr1[i++];
    
    while (j < N2)
        arr3[k++] = arr2[j++];
}

void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++)
        printf(" %d ", arr[i]);
}

void mergeKArrays(int arr[][N], int i, int j, int output[]) {
    if (i == j) {
        for (int p = 0; p < N; p++)
            output[p] = arr[i][p];
        return;
    }

    if (j - i == 1) {
        mergeArrays(arr[i], arr[j], N, N, output);
        return;
    }

    int out1[N * ((i + j) / 2 - i + 1)], out2[N * (j - (i + j) / 2)];
    mergeKArrays(arr, i, (i + j) / 2, out1);
    mergeKArrays(arr, (i + j) / 2 + 1, j, out2);
    
    mergeArrays(out1, out2, N * ((i + j) / 2 - i + 1), N * (j - (i + j) / 2), output);
}

int main() {
    int arr[][N] = {
        {2, 6, 12, 34},
        {1, 9, 20, 1000},
        {23, 34, 90, 2000}
    };
    
    int k = sizeof(arr) / sizeof(arr[0]);
    int output[N * k];

    mergeKArrays(arr, 0, k - 1, output);
    printArray(output, N * k);

    return 0;
}
