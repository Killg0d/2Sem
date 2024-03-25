#include <iostream>
using namespace std;

class TreeNode {
public:
    int data;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int value) : data(value), left(nullptr), right(nullptr) {}
};

class BinarySearchTree {
private:
    TreeNode* root;

    // Private recursive helper functions for traversal
    void preorderTraversal(TreeNode* node) {
        if (node != nullptr) {
            cout << node->data << " ";
            preorderTraversal(node->left);
            preorderTraversal(node->right);
        }
    }

    void inorderTraversal(TreeNode* node) {
        if (node != nullptr) {
            inorderTraversal(node->left);
            cout << node->data << " ";
            inorderTraversal(node->right);
        }
    }

    void postorderTraversal(TreeNode* node) {
        if (node != nullptr) {
            postorderTraversal(node->left);
            postorderTraversal(node->right);
            cout << node->data << " ";
        }
    }

public:
    BinarySearchTree() : root(nullptr) {}

    // Function to insert a node into the BST
    void insert(int value) {
        root = insertNode(root, value);
    }

    // Recursive helper function to insert a node
    TreeNode* insertNode(TreeNode* node, int value) {
        if (node == nullptr) {
            return new TreeNode(value);
        }
        if (value < node->data) {
            node->left = insertNode(node->left, value);
        } else if (value > node->data) {
            node->right = insertNode(node->right, value);
        }
        return node;
    }

    // Function to perform preorder traversal
    void preorder() {
        cout << "Preorder traversal: ";
        preorderTraversal(root);
        cout << endl;
    }

    // Function to perform inorder traversal
    void inorder() {
        cout << "Inorder traversal: ";
        inorderTraversal(root);
        cout << endl;
    }

    // Function to perform postorder traversal
    void postorder() {
        cout << "Postorder traversal: ";
        postorderTraversal(root);
        cout << endl;
    }
};

int main() {
    BinarySearchTree bst;

    // Inserting nodes into the BST using user input
    int n;
    cout << "Enter the number of nodes to insert: ";
    cin >> n;
    cout << "Enter " << n << " values:\n";
    for (int i = 0; i < n; ++i) {
        int value;
        cin >> value;
        bst.insert(value);
    }

    // Performing traversals
    bst.preorder();
    bst.inorder();
    bst.postorder();

    return 0;
}
