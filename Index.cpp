// Write cpp program to find the value index position using find function. arr[] = {10,12,13,14,15,17,20,25,60} find 20 index
#include<iostream>
#include<algorithm>
using namespace std;

int arr[] = {10,12,13,14,15,17,20,25,60};

int main(){
    int n = sizeof(arr)/sizeof(arr[0]);
    int* ptr = find(arr,arr+n,20);

    cout << "20's found at position : " << (ptr-arr) << endl;

}