#include <iostream>
using namespace std;
class poly
{

public:
    int coef, expo;
    poly()
    {
        coef = 0;
        expo = 0;
    }
    void getdata()
    {
        cout << "\nEnter the coefficient:";
        cin >> coef;
        cout << "\nEnter the exponent:";
        cin >> expo;
    };
    void display();
    void add();
};
int main()
{
    int terms;
    cout << "\nEnter number of terms:";
    cin >> terms;
    poly p1[terms+1];
    p1[0].coef = terms;
    for (int i = 1; i <= p1[0].coef; i++)
    {
        p1[i].getdata();
    }
}