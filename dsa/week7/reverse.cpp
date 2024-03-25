#include <iostream>
using namespace std;

class LinkedList
{
        struct node
        {
                int data;
                node *link;
        };
        node *head = NULL;

public:
        void insert(int val);
        void reverse();
        void display();

        node *reverseRecursive(node *curr, node *prev)
        {
                if (curr == NULL)
                        return prev;

                node *next = curr->link;
                curr->link = prev;
                return reverseRecursive(next, curr);
        }
};

void LinkedList::insert(int val)
{
        node *newnode = new node;
        newnode->data = val;
        newnode->link = NULL;
        if (head == NULL)
        {
                head = newnode;
                return;
        }
        else
        {
                node *cur = head;
                while (cur->link != NULL)
                        cur = cur->link;
                cur->link = newnode;
        }
}

void LinkedList::reverse()
{
        head = reverseRecursive(head, NULL);
}

void LinkedList::display()
{
        node *cur = head;
        while (cur != NULL)
        {
                cout << "\t" << cur->data;
                cur = cur->link;
        }
}

int main()
{
        int n, ele;
        LinkedList l;
        cout << "Enter the no. of elements: ";
        cin >> n;
        cout << "Enter the elements:";
        for (int i = 0; i < n; i++)
        {
                cin >> ele;
                l.insert(ele);
        }

        cout << "\nBefore reversing:\n ";
        l.display();

        l.reverse();

        cout << "\nAfter reversing:\n ";
        l.display();
        return 0;
}
