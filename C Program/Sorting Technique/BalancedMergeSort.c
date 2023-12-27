#include <stdio.h>
#define MAX_NUMBERS 100

void merge(int arr1[], int size1, int arr2[], int size2, int result[]) {
    int i = 0, j = 0, k = 0;
    while (i < size1 && j < size2) {
        result[k++] = (arr1[i] >= arr2[j]) ? arr1[i++] : arr2[j++];
    }
    while (i < size1) {
        result[k++] = arr1[i++];
    }
    while (j < size2) {
        result[k++] = arr2[j++];
    }
}

void balancedMergeSort(int arr[], int size) {
    if (size <= 1)
        return;
    int mid = size / 2;
    int left[mid], right[size - mid];
    
    for (int i = 0; i < mid; i++)
        left[i] = arr[i];
    for (int i = mid; i < size; i++)
        right[i - mid] = arr[i];
    
    balancedMergeSort(left, mid);
    balancedMergeSort(right, size - mid);
    
    int sorted[size];
    merge(left, mid, right, size - mid, sorted);
    
    for (int i = 0; i < size; i++)
        arr[i] = sorted[i];
}

int main() {
    int numNumbers;
    scanf("%d", &numNumbers);
    int numbers[MAX_NUMBERS];
    
    for (int i = 0; i < numNumbers; i++) {
        scanf("%d", &numbers[i]);
    }
    
    balancedMergeSort(numbers, numNumbers);
    
    for (int i = 0; i < numNumbers; i++) {
        printf("%d ", numbers[i]);
    }
    
    printf("\n");
    return 0;
}
