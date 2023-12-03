#include <iostream>
using namespace std;

float division(int x, int y)
{
    if (y == 0)
    {
        throw "Infinity";
    }
    else
    {
        return (x / y);
    }
}

int main()
{
    int x = 10;
    int y = 0;
    int k = 0;
    try
    {
        k = division(x, y);
        cout << k << endl;
    }
    catch (const char* e)
    {
        cout << e << endl;
    }
}
