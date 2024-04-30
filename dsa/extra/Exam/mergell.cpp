#include <iostream>
using namespace std;
class LinkedList
{
    struct Node
    {
        int data;
        Node *link;

        Node()
        {
            data = 0;
            link = NULL;
        }
        Node(int d) : data(d), link(NULL) {}
    };

public:
    Node *head = new Node();
    void insert(int val)
    {
        Node *node = new Node(val);
        if (head == NULL)
        {
            head = node;
            return;
        }
        else
        {
            Node *prev = head;
            Node *cur = head->link;
            while (cur != NULL && cur->data < val)
            {
                prev = cur;
                cur = cur->link;
            }
            node->link = prev->link;
            prev->link = node;
        }
    }
    void display()
    {
        Node *cur = head->link;
        while (cur != NULL)
        {
            cout << cur->data << " ";
            cur = cur->link;
        }
    }
    
    LinkedList merge(LinkedList l2)
    {
        LinkedList l3;
        Node *cur1 = head->link;
        Node *cur2 = l2.head->link;
        while(cur1!=NULL&&cur2!=NULL)
        {
            if(cur1->data<cur2->data)
            {
                l3.insert(cur1->data);
                cur1=cur1->link;
            }
            else
            {
                l3.insert(cur2->data);
                cur2=cur2->link;
            }

        }
        while(cur1!=NULL)
        {
            l3.insert(cur1->data);
            cur1=cur1->link;
        }
        while(cur2!=NULL)
        {
            l3.insert(cur2->data);
            cur2=cur2->link;
        }
        return l3;
    }
    void remove(int key)
    {
        if(head==NULL)
        {
            cout<<"\nList is empty.";
            return ;
        }
        Node *prev=head;
        Node *cur=head->link;
        while(cur!=NULL)
        {
            if(cur->data==key)
            {
                prev->link=cur->link;
                cout<<"\nNode "<< key << " deleted successfully.";
                delete cur;
                return;
            }
            prev=cur;
            cur=cur->link;
        }
        cout<<"\nNode not found.";
        
        return ;
    }
    
};

int main()
{
    LinkedList l1, l2, l3;
    l1.insert(8);
    l1.insert(4);
    l1.display();
    cout << endl;
    l2.insert(7);
    l2.insert(3);
    l2.insert(1);
    l2.display();
    cout<<endl;
    l3 = l1.merge(l2);
    l3.display();
    l3.remove(10);

    cout << endl;
    return 0;
}