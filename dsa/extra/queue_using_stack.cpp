#include<iostream>
using namespace std;

class Queue
{
	static const int MAX=5;
	int front,rear;
	int q[MAX];
	public:
		Queue()
		{
			front=0;
			rear=0;
		}
		bool isFull()
		{
			return size()==MAX;	
		}
		bool isEmpty()
		{
			return front==rear;
		}
		int size()
		{
			return rear-front;
		}
		void enqueue(int element)
		{
			if(isFull())
			{
				cout<<"\nOverflow";
			}
			else
			{
				q[rear++]=element;
				
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
				q[front]=0;
				front++;
			}
		}
		int Front()
		{
			if(isEmpty())
				return -1;
			return q[front];
		}
}; 
class Stack
{
    Queue input,output;
    public:
    void enqueue(int ele)
    {
        input.enqueue(ele);
    }
    int pop() {
        if (input.isEmpty()) {
            cout << "Stack is empty. Pop operation failed.\n";
            return -1;
        }
        
        while (input.size() > 1) {
            output.enqueue(input.Front());
            input.dequeue();
        }
        
        int poppedElement = input.Front();
        input.dequeue();
        
        swap(q1, q2);
        
        return poppedElement;
    }
    int top() {
        if (input.isEmpty()) {
            cout << "Stack is empty. Top operation failed.\n";
            return -1;
        }
        return input.back();
    }
};
int main()
{

	
	cout<<endl;
	return 0;
}
