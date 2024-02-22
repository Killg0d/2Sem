#include<iostream>
using namespace std;
const int MAX=50;
class Stack
{
        int top;
        char stack[MAX];
        public:
        Stack()
        {
                top=-1;
        }
        char peek();
        bool isFull();
        bool isEmpty();
        char pop();
        void push(char);
};
char Stack::peek()
{
        if(isEmpty())
                return -1;
        return stack[top];
}
bool Stack::isFull()
{
        return top==MAX-1;
}
bool Stack::isEmpty()
{
        return top==-1;
}
char Stack::pop()
{
        if(isEmpty())
        {
                cout<<"\nUnderflow";
                return 1;
        }
        else
        {
                return stack[top--];
        }
}
void Stack::push(char n)
{
        if(isFull())
        {
                cout<<"\nOverflow";
                return;
        }
        else
        {
                stack[++top]=n;
        }
}
int precedence(char c)
{
        switch(c)
        {
                case '(':return 0;
                case '^':return 1;
                case '*':
                case '/':return 2;
                case '%':return 3;
                case '+':
                case '-':return 4;
        }
        return 0;
}
int main()
{
        Stack s;
        char ch[]="(a+b-(c*d^e))*x+y";
        int length=0;
        for(;ch[length]!='\0';length++);
        cout<<length;
        ch[length+1]=')';
        ch[length+2]='\0';
        // cout<<ch;
        
        // char p[length];
        s.push('(');
        cout<<s.peek();
        return 0;
        // int k=0;
        // for(int i=0;ch[i]!='\0';i++)
        // {
        //         switch(ch[i])
        //         {
        //                 case '(':
        //                         s.push(ch[i]);
        //                         break;
        //                 case '^':
        //                 case '*':
        //                 case '/':
        //                 case '+':
        //                 case '-':
        //                 case '%':
        //                         while(precedence(s.peek())<=precedence(ch[i]))
        //                         {
        //                                 p[k++]=s.pop();
        //                         }
        //                         s.push(ch[i]);
        //                 case ')':while(s.peek()!='(')
        //                          {
        //                                 p[k++]=s.pop();
        //                          }
        //                          if (s.peek()!='(')
        //                          {
        //                             cout<<"Invalid code:";
        //                             exit(0);
        //                          }
        //                          s.pop();
                                 
        //         }
        // }
        // cout<<endl;
        // return 0;
}