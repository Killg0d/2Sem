#include <iostream>
#include <stack>
#include <string>
using namespace std;

class PDA {
public:
    bool isPalindrome(string str) {
        stack<char> st;
        int i = 0;
        
        while (i < str.length()) {
            if (st.empty() || st.top() == str[i]) {
                st.push(str[i]);
                i++;
            } else if (!st.empty() && st.top() != str[i]) {
                st.pop();
                i++;
            }
        }
        
        if (i == str.length() && st.empty()) {
            return true;
        } else {
            return false;
        }
    }
};

int main() {
    PDA pda;
    string str;
    cout << "Enter a string over {a, b}: ";
    cin >> str;
    bool isPal = pda.isPalindrome(str);
    if (isPal) {
        cout << "Palindrome\n";
    } else {
        cout << "Not a palindrome\n";
    }
    return 0;
}
