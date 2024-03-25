
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
        char prefix[50], op;
        int len;
        float val,res,num1,num2;

        cout << "Enter the prefix expression:";
        cin.getline(prefix,50);

        for (int i = 0; prefix[i] != '\0'; i++)
                len++;

        for (int i=len-1;i>=0;i--){
                if(prefix[i]==' ')
                        continue;
                else if(isdigit(prefix[i])){
                        val=0;
			int j=i;
                        while(isdigit(prefix[i]))
                                i--;
                        i++;
                        for(int k=i;k<=j;k++)
                                val=val*10+(prefix[k]-'0');
                        s.push(val);
                }else{
                        op=prefix[i];
                        num2=s.pop();
                        num1=s.pop();
                        switch(op){
                                case '+':res=num2+num1;
                                        break;
                                case '-':res=num2-num1;
                                        break;
                                case '*':res=num2*num1;
                                        break;
                                case '/':
                                        if (num1 == 0) {
                                                cout << "Division by zero\n";
                                                return 1;
                                        }
                                        res=num2/num1;
                                        break;
                                case '%':res=(int)num2%(int)num1;
                                        break;
                                case '^':res=pow(num2,num1);
                                        break;
                        }
                        s.push(res);
                }
        }
        
        res=s.peek();
        cout << "\nResult:" << res << endl;
        return 0;
}
