#include <iostream>
#include <cmath>
using namespace std;
const int MAX = 50;

class Stack
{
        float stack[MAX];
        int top = -1;

public:
        void push(float n);
        float pop();
        float peek();
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

void Stack::push(float n)
{
        if (!isFull())
                stack[++top] = n;
}

float Stack::pop()
{
        if (!isEmpty())
                return stack[top--];
}

float Stack::peek()
{
        if (!isEmpty())
                return stack[top];
}

int main()
{
        Stack s;
        char postfix[50], op;
        float val,res,num1,num2;

        cout << "Enter the postfix expression:";
        cin.getline(postfix,50);

        for (int i = 0; postfix[i] != '\0'; i++){
                if(postfix[i]==' ')
                        continue;
                else if(isdigit(postfix[i])){
                        val=0;
                        while(isdigit(postfix[i])){
                                val=val*10+(int)(postfix[i]-'0');  //ascci value of integer-ascii value of 0  
                                i++;
                        }
                        i--;
                        s.push(val);
                }else{
                        op=postfix[i];
                        num2=s.pop();
                        num1=s.pop();
                        switch(op){
                                case '+':res=num1+num2;
                                        break;
                                case '-':res=num1-num2;
                                        break;
                                case '*':res=num1*num2;
                                        break;
                                case '/':
                                        if (num2 == 0) {
                                                cout << "Division by zero\n";
                                                return 1;
                                        }
                                        res=num1/num2;
                                        break;
                                case '%':res=(int)num1%(int)num2;
                                        break;
                                case '^':res=pow(num1,num2);
                                        break;
                        }
                        s.push(res);
                }
        }
        
        res=s.peek();
        cout << "\nResult:" << res << endl;
        return 0;
}

