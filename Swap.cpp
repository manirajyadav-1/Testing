#include<iostream>
using namespace std;

template<typename T> 
    void swapNumber(T &x,T &y){
        T temp = x;
        x = y;
        y = temp;
}

int main(){
    int a = 10,b = 5;
    swapNumber(a,b);
    cout << "Swapped Integer: " << a << " " << b << endl;
    char x = 'a',y='b';
    swapNumber(x,y);
    cout << "Swapped Integer: " << x << " " << y << endl;

}
