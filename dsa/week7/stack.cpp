#include<iostream>
using namespace std;

class Stack{
        struct node{
                int data;
                node *link;
        };
        node *top=NULL;
public:
        void push(int n);
        int pop();
        int peek();
};

void Stack::push(int n)
{
        if(top==NULL){
                node *newnode=new node;
                newnode->data=n;
                newnode->link=top;
                top=newnode;
        }else{
                node *newnode=new node;
                newnode->data=n;
                newnode->link=top;
                top=newnode;
        }
}

int Stack::pop()
{
        if(top!=NULL){
                int val=top->data;
                node *temp=top;
                top=top->link;
                delete temp;
                cout<<"Element="<<val;
                return val;
        }else
                cout<<"Stack is empty!";
}

int Stack::peek()
{
        if(top!=NULL){
                cout<<"Element="<<top->data;
                return top->data;
        }else
                cout<<"Stack is empty!";
}

int main()
{
        Stack s;
        int ele,ch;
        do{
                cout<<"\n1.Push \n2.Pop \n3.Peek \n4.Exit \nEnter your choice:";
                cin>>ch;
                switch(ch)
                {
                        case 1:
                                cout<<"Enter the element :";
                                cin>>ele;
                                s.push(ele);
                                break;
                        case 2:
                                s.pop();
                                break;
                        case 3:
                                s.peek();
                                break;
                        case 4:
                                break;
                        default:
                                cout<<"Invalid choice.";
                }
        }while(ch!=4);
        return 0;
}
