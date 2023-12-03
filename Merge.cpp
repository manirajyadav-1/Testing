// Write a cpp program to merge two values using merge function.arr[] = {5,6,7} arr1[] = {1,2,3}
#include<iostream>
#include<algorithm>
using namespace std;

int arr[] = {5,6,7};
int arr1[] = {1,2,3};
int dest[6];

int main(){
    merge(arr,arr+3,arr1,arr1+3,dest);
    for(int i=0;i<6;i++){
        cout << dest[i] << " ";
    }
}
