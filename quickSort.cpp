#include<iostream>
using namespace std;

template<typename T>
class QuickSort{
    public:
    int partition(T arr[],int low,int high){
        T pivot = arr[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr[i],arr[j]);
            }
        }
        i++;
        swap(arr[i],arr[high]);
        return i;
    }
    void quicksort(T arr[],int low,int high){
        if(low<=high){
            int pivot = partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
};

template<typename T>
void print(T arr[],int n){
    for(int i=0;i<n;i++){
        cout << arr[i] << " ";
    }

}

int main(){
    int arr[] = {8,5,9,2,1,4,6};
    int n = sizeof(arr)/sizeof(arr[0]);

    QuickSort<int> q;
    q.quicksort(arr,0,n-1);
    print(arr,n);
}