#include<iostream>
using namespace std;
void swap(int* array, int min, int i) {
    int temp = array[min];
    array[min] = array[i];
    array[i] = temp;
}
void selection(int *a,int n)
{
    for(int i=0;i<n;i++)
    {
        int min=i;
        int j=i+1;
        for(;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
        }
        swap(a,min,i);
        
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
    selection(arr, n);

    cout << "\nSorted array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout<<endl;
    return 0;
}