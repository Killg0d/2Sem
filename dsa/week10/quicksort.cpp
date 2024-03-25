#include <iostream>
using namespace std;

void swap(int* array, int low, int high) {
    int temp = array[low];
    array[low] = array[high];
    array[high] = temp;
}

int partition(int* array, int low, int high) {
    int pivot = array[low];
    int i = low + 1;
    int j = high;

    while (i <= j) {
        while (i <= j && array[i] <= pivot)
            i++;
        while (i <= j && array[j] > pivot)
            j--;
        if (i < j)
            swap(array, i, j);
    }
    swap(array, low, j);
    return j;
}

void quicksort(int* array, int low, int high) {
    if (low < high) {
        int mid = partition(array, low, high);
        quicksort(array, low, mid - 1); // Sort left sub-array
        quicksort(array, mid + 1, high); // Sort right sub-array
    }
}

int main() {
    int arr[50];
    int n;
    cout<<"\nEnter the size:";
    cin>>n;
    cout<<"\nEnter the elements:";
    for(int i=0;i<n;i++)
        cin>>arr[i];
    quicksort(arr, 0, n - 1);

    cout << "\nSorted array: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;

    return 0;
}
