#include <iostream>
using namespace std;
const int MAX = 50;

class Stack
{
        char stack[MAX];
        int top = -1;

public:
        void push(char n);
        char pop();
        char peek();
        bool isFull();
        bool isEmpty();
};

bool Stack::isFull()
{
        return top == MAX - 1;
}

bool Stack::isEmpty()
{
        return top == -1;
}

void Stack::push(char n)
{
        if (!isFull())
                stack[++top] = n;
}

char Stack::pop()
{
        if (!isEmpty())
                return stack[top--];
        return '\0';
}

char Stack::peek()
{
        if (!isEmpty())
                return stack[top];
        return '\0';
}

int getPrecedence(char op)
{
        switch (op)
        {
        case '^':
                return 3;
        case '*':
        case '/':
        case '%':
                return 2;
        case '+':
        case '-':
                return 1;
        default:
                return 0;
        }
}

int main()
{
        Stack s;
        char infix[50], postfix[50], op, ele;
        int len = 0, j = 0;

        cout << "Enter the infix expression:";
        cin >> infix;

        for (int i = 0; infix[i] != '\0'; i++)
                len++;

        s.push('(');
        infix[len] = ')';
        infix[len + 1] = '\0';

        for (int i = 0; infix[i] != '\0'; i++)
        {
                op = infix[i];
                switch (op)
                {
                case '(':
                        s.push(op);
                        break;
                case ')':
                        if (s.isEmpty())
                        {
                                cout << "Invalid infix expression\n";
                                return 0;
                        }
                        while ((ele = s.pop()) != '(')
                                postfix[j++] = ele;
                        break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                case '^':
                        while (getPrecedence(s.peek()) >= getPrecedence(op))
                        {
                                ele = s.pop();
                                postfix[j++] = ele;
                        }
                        s.push(op);
                        break;
                default:
                        postfix[j++] = op;
                        break;
                }
        }
        if (!s.isEmpty())
        {
                cout << "Invalid infix expression\n";
                return 0;
        }

        postfix[j] = '\0';

        cout << "\nPostfix expression:" << postfix << endl;
        return 0;
}
