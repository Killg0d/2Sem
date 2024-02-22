#include <iostream>
#include <stack>

using namespace std;

int evaluate(char *p)
{
    stack<int> s;
    for (int i = 0; p[i] != '\0'; i++)
    {
        if (p[i] == ' ') // if it is space we skip one
            continue;

        if (isdigit(p[i]))
        {
            int num = 0;
            while (isdigit(p[i]))
            {
                num = num * 10 + (p[i] - '0'); // Ascii value of numers is x0 - x9 if we subtract x1-x0 we will get 1
                i++;
            }
            i--;
            s.push(num);
        }
        else
        {
            int op1, op2;
            op2 = s.top();
            s.pop();
            op1 = s.top();
            s.pop();
            int eval;
            switch (p[i])
            {
            case '*':
                eval = op1 * op2;
                break;
            case '/':
                eval = op1 / op2;
                break;
            case '+':
                eval = op1 + op2;
                break;
            case '-':
                eval = op1 - op2;
                break;
            case '^':
                eval = op1 ^ op2;
                break;
            case '%':
                eval = op1 % op2;
                break;
            }
            s.push(eval);
        }
    }
    int value;
    value = s.top();
    return value;
}

int main()
{
    char postfix[50];
    cout << "Enter an expresion:";
    cin.getline(postfix,50);
    int value;
    value = evaluate(postfix);
    cout << value;
    cout << endl;
    return 0;
}