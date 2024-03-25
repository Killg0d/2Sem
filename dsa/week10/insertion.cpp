#include<iostream>
using namespace std;
void swap(int* array, int min, int i) {
    int temp = array[min];
    array[min] = array[i];
    array[i] = temp;
}
void insertion(int *a,int n)
{
    for(int i=1;i<n;i++)
    {
        int temp=a[i];
        int j=i-1;
        for(;j>=0&&temp<a[j];j--)
        {
            a[j+1]=a[j];
        }
        a[j+1]=temp;
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
    insertion(arr, n);

    cout << "\nSorted array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout<<endl;
    return 0;
}