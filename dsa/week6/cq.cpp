#include<iostream>
using namespace std;

class CQueue
{
        static const int MAX=5;
        int front,rear;
        int q[MAX];
        int count;
        public:
                CQueue()
                {
                        front=0;
                        rear=0;
                        count=0;
                }
                bool isFull()
                {
                        return count==MAX;
                }
                bool isEmpty()
                {
                        return count==0;
                }
                void enqueue(int element)
                {
                        if(isFull())
                        {
                                cout<<"\nOverflow";
                        }
                        else
                        {
                                count++;
                                q[rear]=element;
                                rear=(rear+1)%MAX;
                        }
                }
                void dequeue()
                {
                        if(isEmpty())
 {
                                cout <<"\nUnderflow";

                        }
                        else
                        {
                                count--;
                                q[front]=0;
                                front=(front+1)%MAX;
                        }
                }
                int Front()
                {
                        return q[front];
                }
};
int main()
{
        CQueue q;
        int ch;
do
        {
                cout<<"\n1.Enqueue\n2.Dequeue\n3.Front\n4.exit\nEnter your choice:";
                cin>>ch;
                switch(ch)
                {
                        case 1: cout<<"\nEnter an element:";int ele;cin>>ele;
                                q.enqueue(ele);
                                break;
                        case 2: cout<<"\nElement is deleted :";
                                q.dequeue();
                                break;
                        case 3: cout<<"\nElement at the front is:"<<q.Front();
                                break;
                        case 4:exit(1);
                        default:cout<<"\nInvalid choice\n";

                }
        }while(ch!=4);
        cout<<endl;
        return 0;
}