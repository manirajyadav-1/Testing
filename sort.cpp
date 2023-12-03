// Write a cpp to sort a given values using sort function.arr[] =  {7,6,2,7,3,7}
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int arr[] = {5, 4, 3, 2, 1};
    sort(arr, arr + 5);
    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << " " ;
    }
}
