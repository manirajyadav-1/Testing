// Write a cpp program to find pattern in the existing array using search function. arr[] = {40,50,60} arr1[] = {40,50}
#include <iostream>
#include <algorithm>
using namespace std;

int arr[] = {10, 20, 30, 40, 50, 60};
int pattern[] = {40, 50};

int main()
{
    int *ptr;
    ptr = search(arr, arr + 6, pattern, pattern + 2);

    if (ptr == arr + 6)
    {
        cout << "No Match Found" << endl;
    }
    else
    {
        cout << "Match at " << (ptr - arr) << endl;
    }
}