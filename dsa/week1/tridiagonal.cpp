//Conversion of Tridiagonal to list
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

        cout<<"\nEnter the "<<(3*order)-2<<" elements of Tridiagonal matrix:";
        for(int i=0;i<order;i++)
        {
                for(int j=0;j<order;j++)
                {
                        if(abs(i-j)>1)
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
        int k=0,r[3*order-2];//Initializing to square of order
        for(int i=0;i<order;i++)
        {
                for(int j=0;j<order;j++)
                {
                        if(abs(i-j)<=1)
                        {
                                r[k++]=a[i][j];
                        }
                }
        }
        cout<<"\n1 D array is:\n";
        for(int i=0;i<((3*order)-2);i++)
        {
                cout<<r[i]<<"\t";
        }
        int m,n;
        cout<<"\nEnter index to verify tridiagonal(row,col):";
        cin>>m>>n;
        if(abs(m-n)>1)
        {
                cout<<"\nOrder out of Bounds\n";
                exit(1);
        }
        cout<<"\n2D element is:"<<a[m][n];
        cout<<"\n1D element is:"<<r[2*m+n];
        cout<<endl;
        return 0;
}
