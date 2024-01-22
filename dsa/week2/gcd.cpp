#include<iostream>
using namespace std;
int gcd(int a,int b)
{
    //cout<<"\ngcd: "<<numDisks<<"\t"<<source<<"\t"<<aux;
    if(b == 0)
        return a;
    if (a == 0 )
        return b;
    gcd(b,a%b);    
}
int main(){
    int num1,num2;
    cout<<"\nEnter the 2 numbers to find the gcd between them :";
    cin>>num1>>num2;
    cout<<"\nThe gcd between "<<num1<<" and "<<num2<<" is "<<gcd(num1,num2);
    cout<<endl;
    return 0;
}