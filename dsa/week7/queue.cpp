#include<iostream>
using namespace std;

class Queue{
        struct node{
                int data;
                node *link;
        };
        node *front=NULL;
        node *rear=NULL;
public:
        void enqueue(int n);
        int dequeue();
        int Front();
};

void Queue::enqueue(int n)
{
        if(rear==NULL){
                node *newnode=new node;
                newnode->data=n;
                newnode->link=NULL;
                rear=newnode;
                front=newnode;
        }else{
                node *newnode=new node;
                newnode->data=n;
                newnode->link=NULL;
                rear->link=newnode;
                rear=newnode;
        }
}

int Queue::dequeue()
{
        if(front!=NULL){
                int val=front->data;
                node *temp=front;
                front=front->link;
                delete temp;
                cout<<"Element="<<val;
                return val;
        }else{
                cout<<"Queue is empty!";
                rear=NULL;
        }
}

int Queue::Front()
{
        if(front!=NULL){
                cout<<"Element="<<front->data;
                return front->data;
        }else{
                cout<<"Queue is empty!";
                rear=NULL;
        }
}

int main()
{
        Queue q;
        int ele,ch;
        do{
                cout<<"\n1.Enqueue \n2.Dequeue \n3.Front \n4.Exit \nEnter your choice:";
                cin>>ch;
                switch(ch)
                {
                        case 1:
                                cout<<"Enter the element :";
                                cin>>ele;
                                q.enqueue(ele);
                                break;
                        case 2:
                                q.dequeue();
                                break;
                        case 3:
                                q.Front();
                                break;
                        case 4:
                                break;
                        default:
                                cout<<"Invalid choice.";
                }
        }while(ch!=4);
        return 0;
}