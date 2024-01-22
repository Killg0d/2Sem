//Conversion of uppertri matrix to list
//230970005
//Tarun
//05-01-2024

#include<iostream>
#include<cmath>
using namespace std;

int main()
{
        int order,a[5][5];

        cout<<"Enter the order of matrix:";
        cin>>order;

        cout<<"\nEnter the "<<order*(order+1)/2<<" elements of upper Triangular matrix:";
        for(int i=0;i<order;i++)
        {
                for(int j=0;j<order;j++)
                {
                        if(i>j)
                        {
                                a[i][j]=0;
                        }
                        else
                        {
                                cin>>a[i][j];
                        }
                }
        }

        cout<<"Contents of the 2D Matrix:\n";
        for(int i=0;i<order;i++)
        {
                for(int j=0;j<order;j++)
                {
                        cout<<a[i][j]<<"\t";
                }
                cout<<endl;
        }

        cout<<"\nMapping logic being executed for 2d to 1d:";
        int k=0,r[order*(order+1)/2];//Initializing to square of order
        for(int i=0;i<order;i++)
        {
                for(int j=0;j<order;j++)
                {
                        if(i<=j)
                        {
                                r[k++]=a[i][j];
                        }
                }
        }
        cout<<"\n1 D array is:\n";
        for(int i=0;i<(order*(order+1)/2);i++)
        {
                cout<<r[i]<<"\t";
        }
        int m,n;
        cout<<"\nEnter index to verify upper triangular matrix (row,col):";
        cin>>m>>n;
        if(m>n||m>order||n>order)
        {
                cout<<"\nOrder out of Bounds\n";
                exit(1);
        }
        cout<<"\n2D element is:"<<a[m][n];
        int offset=((order*m)+n-(m*(m+1)/2));

        cout<<"\n1D element is:"<<r[offset];

        cout<<endl;
        return 0;
}