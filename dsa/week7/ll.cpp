#include<iostream>
using namespace std;

class LinkedList{
        struct node{
                int data;
                node *link;
        };
        node *head=new node();
 
public:
        LinkedList(){
                head->link=NULL;
        }
        void insert(int val);
        void deleteNode(int val);
        void display();
};

void LinkedList::insert(int val)
{
        if(head==NULL){
                node *newnode=new node;
                newnode->data=val;
                newnode->link=NULL;
                head->link=newnode;
        }else{
                node *prev=head;
                node *cur=head->link;
                while(cur!=NULL){
                        if(val<cur->data)
                                break;
                        prev=cur;
                        cur=cur->link;
                }
                node *newnode=new node;
                newnode->data=val;
                newnode->link=prev->link;                
		prev->link=newnode;
        }
}

void LinkedList::deleteNode(int val){
        node *prev=head;
        node *cur=head->link;
        while(cur!=NULL){
                if(val==cur->data){
                        prev->link=cur->link;
                        cout<<"\nNode "<<cur->data<<" deleted successfully\n";
                        delete cur;
                        return;
                }      
                prev=cur;
                cur=cur->link;
        }
        cout<<"\nNode "<<val<<" not found\n";
}

void LinkedList::display(){
        node *cur=head->link;       
        while(cur!=NULL){
                cout<<"\t"<<cur->data;
                cur=cur->link;
        }
}

int main()
{
        int ch,ele;
        LinkedList l;
        do{
               cout<<"\nMenu\n1.Insert a node\n2.Delete a node\n3.Display\n4.Exit\nEnter your choice: ";
                cin>>ch; 
                switch(ch){
                        case 1:
                                cout<<"Enter the element:";
                                cin>>ele;
                                l.insert(ele);
                                break;
                        case 2:
                                cout<<"Enter the element:";
                                cin>>ele;
                                l.deleteNode(ele);
                                break;
                        case 3:
                                l.display();
                                break;
                        case 4:
                                break;
                }
        }while(ch!=4);
        return 0;
}
