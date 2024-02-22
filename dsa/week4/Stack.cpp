#include<iostream>
using namespace std;
const int MAX=4;
class Stack
{
        int top;
        int stack[MAX];
        public:
        Stack()
        {
                top=-1;
        }
        int peek();
        bool isFull();
        bool isEmpty();
        int pop();
        void push(int);
};
int Stack::peek()
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
int Stack::pop()
{
        if(isEmpty())
        {
                cout<<"\nUnderflow";
                return -1;
        }
        else
        {
                return stack[top--];
        }
}
void Stack::push(int n)
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
int main()
{
        Stack s;
        int ch;
        int n;
        do{
                cout<<"\n1.Push\n2.Pop\n3.Peek\n4.Exit\nEnter your choice:";
                cin>>ch;
                switch(ch)
                {
                        case 1:
                                cout<<"\nEnter element:";
                                cin>>n;
                                s.push(n);
                                break;
                        case 2:
                                cout<<"\nDeleted element is:"<<s.pop();
                                break;
                        case 3:
                                cout<<"\nTop of stack contains:"<<s.peek();
                                break;
                        case 4:exit(0);
                        default: cout<<"\nInvalid Choice";
                }
        }while(ch!=4);
        cout<<endl;
        return 0;
}