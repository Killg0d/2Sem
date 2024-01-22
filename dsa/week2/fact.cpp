#include<iostream>
using namespace std;
int  fact(int n)
{
    if (n==1)
    {
        return 1;
    }
    return n*fact(n-1);
}
int main(){
    int num;
    cout<<"\nEnter a number:";
    cin>>num;
    cout<<"The factorial is:"<<fact(num);
    return 0;
}