#include<iostream>
#include<algorithm>
using namespace std;

int arr[] = {10,20,30,40,50};

int main(){
    int *ptr;
    ptr = find(arr,arr+5,30);
    cout << ptr-arr;
}