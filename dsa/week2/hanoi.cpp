#include<iostream>
using namespace std;
void towers(int numDisks,char source='S', char dest='D', char aux='A')
{
    //cout<<"\ntowers: "<<numDisks<<"\t"<<source<<"\t"<<aux;
    if(numDisks == 1)
        cout<<"\nMove from "<<source<<" to "<<dest;
    else
    {
        towers(numDisks-1,source,aux,dest);
        cout<<"\nMove from "<<source<<" to "<<dest;
        towers(numDisks-1,aux,dest,source);
    }
}
int main(){
    int rings;
    cout<<"\nEnter the number of rings:";
    cin>>rings;
    towers(rings);
    return 0;
}