#include<stdio.h>

int binarysearch(int arr[],int key,int low,int high){
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid] == key){
            return key;
        }
        if(arr[mid] < key){
            low = mid+1;
        }
        else{
            high = mid - 1;
        }
    }
    return -1;
}

int main(){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int n = sizeof(arr)/sizeof(arr[0]);
    int key;
    printf("Enter a key to be searched:");
    scanf("%d",&key);
    if(binarysearch(arr,key,0,n-1) == -1){
        printf("Not Found");
    }
    else{
        printf("Found");
    }
    return 0;
}