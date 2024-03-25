#include<iostream>
using namespace std;
const int MAX=5;
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
            return -1;
        return s[top];
    }

};
int main()
{
    char w[5],wr[5];
    int lw,lwr;
    cout<<"\nEnter the string:";
    cin>>w;
    cout<<"\nEnter the rev string:";
    cin>>wr;
    for(lw=0;w[lw]!='\0';lw++);
    for(lwr=0;wr[lwr]!='\0';lwr++);
    char nw[lw+lwr+2];
    for(int i=0;i<lw;i++)
    {
        nw[i]=w[i];
    }
    nw[lw]='c';
    for(int i=lw+1;i<=lw+lwr;i++)
    {
        nw[i]=wr[i-lw-1];
    }
    nw[lw+lwr+1]='\0';
    cout<<nw;
    Stack s;
    int i=0;
    while(i<lw)
    {
        s.push(nw[i]);
        i++;
    }
    i++;
    cout<<i;
    int flag=0;
    while(i!=lw+lwr)
    {
        cout<<s.peek()<<"=="<<nw[i]<<"\n";
        if(nw[i]==s.peek())
        {
            s.pop();
        }
        else{
            flag=1;
            break;
        }
        i++;
            
    }
    if(flag==0)
    {
        cout<<"Valid";
    }
    else 
        cout<<"invalid";

    return 0;
}