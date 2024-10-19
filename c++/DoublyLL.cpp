#include <iostream>
using namespace std;

// Definition of Node class for Doubly Linked List
class Node
{
public:
    Node *previous;
    int data;
    Node *next;
};

// Function to insert a node at a given position
Node *Insert(int pos, int x, Node *head)
{
    Node *t, *p;
    // Insert at the beginning (position 0)
    if (pos == 0)
    {
        t = new Node;
        t->data = x;
        t->previous = NULL;   // New node's previous is NULL
        t->next = head;       // New node points to current head

        if (head != NULL)
            head->previous = t; // Update the old head's previous pointer to the new node

        head = t;              // Update head to the new node
    }
    // Insert at any position other than 0
    else
    {
        p = head;
        for (int i = 0; i < pos - 1; i++)
            p = p->next;        // Traverse to the node before the insertion point

        t = new Node;
        t->data = x;
        t->previous = p;        // New node's previous points to current node
        t->next = p->next;      // New node's next points to current node's next

        if (p->next)
            p->next->previous = t; // Update the next node's previous pointer to the new node

        p->next = t;            // Update current node's next to the new node
    }
    return head;                // Return updated head pointer
}

// Function to display the doubly linked list
void display(Node *head)
{
    Node *p = head;
    while (p != NULL)
    {
        cout << p->data << " ";
        p = p->next;  // Move to the next node
    }
    cout << endl;  // Print newline after the list is displayed
}

int main()
{
    Node *first = NULL;   // Initialize the head of the linked list
    int n, x, pos;
    
    // Input the number of elements to insert
    cout << "Enter the number of elements in the list: ";
    cin >> n;

    // Insert elements into the list
    for (int i = 0; i < n; i++)
    {
        cin >> x;               // Input value to insert
        first = Insert(i, x, first); // Insert at position i
    }

    // Display the resulting list
    display(first);

    return 0;
}
