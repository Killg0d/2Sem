#include <iostream>
using namespace std;

class DoublyLinkedList {
private:
    struct Node {
        int data;
        Node* prev;
        Node* next;
        Node(int value) : data(value), prev(nullptr), next(nullptr) {}
    };

    Node* head;

public:
    DoublyLinkedList() : head(nullptr) {}

    // Function to insert a node into the sorted doubly linked list
    void insert(int value) {
        Node* newNode = new Node(value);

        if (head == nullptr || value <= head->data) {
            newNode->next = head;
            if (head != nullptr)
                head->prev = newNode;
            head = newNode;
            return;
        }

        Node* current = head;
        while (current->next != nullptr && current->next->data < value) {
            current = current->next;
        }

        newNode->next = current->next;
        if (current->next != nullptr)
            current->next->prev = newNode;
        current->next = newNode;
        newNode->prev = current;
    }

    // Function to delete a node from the sorted doubly linked list
    void remove(int value) {
        if (head == nullptr)
            return;

        if (head->data == value) {
            Node* temp = head;
            head = head->next;
            if (head != nullptr)
                head->prev = nullptr;
            delete temp;
            return;
        }

        Node* current = head;
        while (current != nullptr && current->data != value) {
            current = current->next;
        }

        if (current == nullptr)
            return;

        if (current->prev != nullptr)
            current->prev->next = current->next;
        if (current->next != nullptr)
            current->next->prev = current->prev;

        delete current;
    }

    // Function to display the list in forward direction
    void displayForward() {
        Node* current = head;
        while (current != nullptr) {
            cout << current->data << " ";
            current = current->next;
        }
        cout << endl;
    }

    // Function to display the list in backward direction
    void displayBackward() {
        Node* current = head;
        while (current->next != nullptr) {
            current = current->next;
        }
        while (current != nullptr) {
            cout << current->data << " ";
            current = current->prev;
        }
        cout << endl;
    }

    // Destructor to free memory
    ~DoublyLinkedList() {
        Node* current = head;
        while (current != nullptr) {
            Node* temp = current;
            current = current->next;
            delete temp;
        }
    }
};

int main() {
    DoublyLinkedList list;
    int choice, value;

    do {
        cout << "Menu:\n"
             << "1. Insert\n"
             << "2. Delete\n"
             << "3. Display (Forward)\n"
             << "4. Display (Backward)\n"
             << "5. Exit\n"
             << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter value to insert: ";
                cin >> value;
                list.insert(value);
                break;
            case 2:
                cout << "Enter value to delete: ";
                cin >> value;
                list.remove(value);
                break;
            case 3:
                cout << "List in forward direction: ";
                list.displayForward();
                break;
            case 4:
                cout << "List in backward direction: ";
                list.displayBackward();
                break;
            case 5:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice!\n";
        }
    } while (choice != 5);

    return 0;
}
