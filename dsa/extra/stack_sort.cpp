#include<iostream>
using namespace std;
const int MAX=10;
class Stack
{
    char s[MAX];
    int top;
    public:
    Stack()
    { top=-1; }
    bool isFull()
    {
        return top==MAX;
    }
    bool isEmpty()
    {
        return top==-1;
    }
    void push(int val)
    {
        if(!isFull())
            s[++top]=val;
    }
    void pop()
    {
        if(!isEmpty())
        {
            top--;
        }
    }
    char peek()
    {
        if(isEmpty())
            return '^';
        return s[top];
    }

};
int main()
{
    Stack s1,s2;
    char ch[10];
    cout<<"\nEnter a String:";
    cin>>ch;
    for(int i=0;ch[i]!='\0';i++)
    {
        s1.push(ch[i]);
    }
    char temp;
    while(!s1.isEmpty()){
        temp=s1.peek();
        s1.pop();
        while((!s2.isEmpty())&&temp<s2.peek())
        {
            s1.push(s2.peek());
            s2.pop();
        }
        s2.push(temp);
    }
    while(!s2.isEmpty()){
        cout<<s2.peek();
        s2.pop();
    }
    return 0;
}