// Solve the tower of hanoi using Stack
#include <iostream>
using namespace std;
class Stack
{
    static const int MAX = 10;
    int top, s[MAX];

public:
    Stack()
    {
        top = -1;
    }
    void push(int n)
    {
        if (top <= MAX)
        {
            s[++top] = n;
        }
    }
    void pop()
    {
        if (top > -1)
        {
            top--;
        }
    }
    int peek()
    {
        if (top > -1 && top <= MAX)
        {
            return s[top];
        }
    }
};

int main()
{
    Stack s[4]; // number of stack arrays repesents the number of towers[1:3]
    void towersOfHanoi(int n)
    {
        for (int d = n; d > 0; d--)
            towers[1].push(d); //
    }
    cout << endl;
    return 0;
}