#include <iostream>
#include <exception>

using namespace std;

class MyException: public exception{
    public:
    const char* what() const throw(){
        return "Attempted to divide by 0!";
    }
};

int main(){
    try{
        int x,y;
        cin >> x >> y;
        if(y==0){
            MyException z;
            throw z;
        }
        else
        cout << "X/Y: " << x/y << endl;
    }
    catch(exception& e){
        cout << e.what();
    }
}