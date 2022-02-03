/*
 * This program introduces the concept of linked list and some algorithms to handle them 
 */

import java.util.*;

public class IntroLinkedList
{
	public static void main (String[] args)
	{
		Node n1_a = new Node(1);
		Node n1_b = new Node(2);
		Node n1_c = new Node(3);
		Node n1_d = new Node(4);

		Node n2_a = new Node(7);
		Node n2_b = new Node(8);
		Node n2_c = new Node(9);		

		n1_a.setNext (n1_b);
		n1_b.setNext (n1_c);
		n1_c.setNext (n1_d);
		n1_d.setNext (null);

		n2_a.setNext (n2_b);
		n2_b.setNext (n2_c);
		n2_c.setNext (null);

		// Traversing the first linked list
		System.out.println ("The first linked list is: ");
		Traverse(n1_a);
		// Traversing the second linked list
		System.out.println ("\nThe second linked list is: ");
		Traverse(n2_a);

		// Insert a node to the linked List
		// Delete a node from the linked list		
	}

	public static void Traverse (Node head)
	{
		if (head != null)
		{
			Node currentNode = head;
			while (currentNode.getNext() != null)
			{
				System.out.println(currentNode.getValue());
				currentNode = currentNode.getNext();
			}
			System.out.println(currentNode.getValue());
		}
		else
		{
			System.out.println ("This linked list is empty");
			System.exit (1);
		}
	}
}

class Node
{
	private int value;
	private Node nextNode;
	
	public Node (int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int data)
	{
		this.value = value;
	}

	public Node getNext ()
	{
		return nextNode;
	}

	public void setNext (Node nextNode)
	{
		this.nextNode = nextNode;
	}

}

