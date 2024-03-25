#include<iostream>
using namespace std;
int  fibo(int n)
{
    if(n==0)
    {
        return 0;
    }
    if (n == 1 )
    {
        return 1;
    }
    return fibo(n-2)+fibo(n-1);
}
int main(){
    int num;
    cout<<"\nEnter a limit:";
    cin>>num;
    for(int i=0;i<num;i++){
        cout<<fibo(i)<<"\t";
    }
    return 0;
}