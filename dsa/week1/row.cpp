#include <iostream>
using namespace std;
int main()
{
    int r, c;

    cout << "Enter the row and coloumn size";
    cin >> r >> c;
    int arr2d[r][c];
    cout << "Enter the elements of the array:";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cin >> arr2d[i][j];
        }
    }
    cout << "The elements are:";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cout << arr2d[i][j] << " ";
        }
        cout << endl;
    }
    int arr1d[r];
    cout << "Converting 2d array to 1d array" << endl;
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            arr1d[i * c + j] = arr2d[i][j];
        }
    }
    for (int i = 0; i < r * c; i++)
    {
        cout << arr1d[i] << " ";
    }
     cout << "The elements are:";
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            cout << arr2d[i][j] << " ";
        }
        cout << endl;
    }
    cout << endl;

    int row, col;
    cout << "Enter the position to check the offset:" << endl;
    cin >> row >> col;
    cout << arr2d[0][0]<<endl;
    if (row >= 0 && row < r && col >= 0 && col < c)
    {
        int off = row * c + col;
        cout << "The Value at position is: " << arr2d[row][col] << endl;
        cout << "The value at calculated offset: " << arr1d[off] << endl;
        cout << off << endl;
    }
    else
    {
        cout << "The location is invalid!" << endl;
    }

    return 0;
}