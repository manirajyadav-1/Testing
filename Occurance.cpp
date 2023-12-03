// Write cpp program to find a given number occurrence in existing array using count function. arr[] = {5,6,6,7,10,11}. Find 6.

#include<iostream>
#include<algorithm>
using namespace std;

int arr[] = {5,6,6,7,10,11,6,7,8,10,7,6,6,6,6,6,6};

int main(){
    int n = sizeof(arr)/sizeof(arr[0]);
    int c = count(arr,arr+n,6);
    cout << "Total 6 is: " << c << endl;
    return 0;
}