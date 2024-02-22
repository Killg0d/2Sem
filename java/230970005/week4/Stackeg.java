//Create a class called Stack with necessary fields and constructors. Use static methods for
//push and pop operations.
//tarun
//230970005
//05-02-2024
import java.util.Scanner;

class Stack {
	final static int MAX = 4;
	static int s[] = new int[MAX];
	static int top;

	Stack() {
		top = -1;
	}

	public static boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public static boolean isFull() {
		if (top >= MAX-1)
			return true;
		return false;
	}

	public static void push(int value) {
		if (isFull()) {
			System.out.println("Stack overflow!");
		} else
			s[++top] = value;
	}

	public static int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow!");
			return 0;
		} else
			return s[top--];
	}
	public static int peek()
	{
		return s[top];
	}
}

public class Stackeg {
	public static void main(String[] args) {

		int ch;
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Exit\nEnter your choice:");
			ch = sc.nextInt();
			switch (ch) {
				case 1:
					System.out.println("\nEnter element:");
					n=sc.nextInt();
					Stack.push(n);
					break;
				case 2:
					System.out.println("\nDeleted element is:" + Stack.pop());
					break;
				case 3:
					System.out.println("\nTop of stack contains:" + Stack.peek());
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("\nInvalid Choice");
			}
		} while (ch != 4);
	}
}
