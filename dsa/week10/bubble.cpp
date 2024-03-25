#include<iostream>
using namespace std;
void bubblesort(int *a,int n)
{
    bool sorted=true;
    for(int i=0;i<n&&sorted;i++)
    {
        sorted=false;
        for(int j=n-1;j>i;j--)
        {
            if(a[j]<a[j-1])
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                sorted=true;
            }
        }
    }
}
int main()
{
    int arr[50];
    int n;
    cout<<"\nEnter the size:";
    cin>>n;
    cout<<"\nEnter the elements:";
    for(int i=0;i<n;i++)
        cin>>arr[i];
    bubblesort(arr, n);

    cout << "\nSorted array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout<<endl;
    return 0;
}