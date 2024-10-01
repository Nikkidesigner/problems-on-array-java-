class Stack
{
	private int top;
	private int maxsize;
	private int[] arr;

	public Stack(int maxsize)
		{
			this.maxsize = maxsize;
			this.top=-1;
			 arr = new int[maxsize];
		}
	public void push(int num)
		{
			if(top>=maxsize-1)
				{
					System.out.println("stack is full.");
				}
			else
				{
					top++;
					arr[top]=num;
					System.out.println(arr[top]+" pushed into the stack.");
				}
		}
	public void pop()
		{
			if(top<=-1)
				{
					System.out.println("Stack is empty");
				}
			else
				{
				
			System.out.println(arr[top]+" is popped out of the stack.");
			top--;
				}

		}
	public void display()
		{
			if(top<=-1)
				{
					System.out.println("Stack is empty");
				}
			else
				{
				
			int temp=top;
			while(temp>-1)
				{
					System.out.println(arr[temp]);
					temp--;
				}
				}
		   
			
		}
	
}

class Node
{
	private String data;
	private Node next;

	public Node(String data)
		{
			this.next=null;
			this.data=data;
		}

	public void setNext(Node next)
		{
			this.next = next;
		}
	public Node getNext()
		{
			return this.next;
		}
	public void setData(String data)
		{
			this.data=data;
		}
	public String getData()
		{
			return this.data;
		}
}
class LinkedList 
{
	private Node head;
	private Node tail;

    public void insertNodeAtEnd(String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail=node;
				}
			else
				{
					this.tail.setNext(node);
					this.tail=node;
				}
			System.out.println(node.getData()+" inserted into the linked list");
		}
	public void insertNodeAtStart(String data)
		{
			Node node = new Node(data);

			if(this.head==null)
				{
					this.head=this.tail=node;
				}
			else
				{
					node.setNext(this.head);
					this.head=node;
				}
			System.out.println(node.getData()+" inserted into the linked list");
		}
	public void insertAtPosition(String dataAfter, String data)
		{
			Node node = new Node(data);
			if(this.head==null)
				{
					this.head=this.tail=node;
					System.out.println(node.getData()+" inserted into the linked list");
				}
			else
				{
					Node temp = this.head;
					while(temp.getData()!=dataAfter)
						{
							temp = temp.getNext();
						}
                      if(temp.getNext()==null)
						{
							this.tail=node;
						}
						if (temp == null)
						{
							System.out.println("The specified node was not found.");
						}
					else
						System.out.println(node.getData()+" inserted into the linked list");

					node.setNext(temp.getNext());
					temp.setNext(node);
					
				}
					
		}
	public void displayLinkedList()
		{
			Node temp = this.head;
			System.out.println("Linked list :");
			if(temp==null)
				{
					System.out.println("LinkedList is empty.");
				}
			else
				{
					while(temp!=null)
						{
							System.out.println(temp.getData());
							temp = temp.getNext();
						}
				}
		}
	public void deleteNode(String data)
		{
			Node temp = this.head;
			if(temp==null)
				{
					System.out.println("Node is not present in the linked list.");
				}
			else
			{
				while(temp.getData()!=data)
				{
					temp=temp.getNext();
				}
			 if(temp==this.head)
				{
					//scenario 1 (single node is present in LL)
					if(temp==this.tail)
						{
							this.head=this.tail=null;
						}
					//scenario 2 (Delete head of the LL)
					this.head=temp.getNext();
				}
			else if(temp==this.tail)
				{
					//scenario 3 (Delete tail of LL)
					Node before = this.head;
					while(before.getNext()!=this.tail)
						{
							before= before.getNext();
						}
					this.tail=before;
				}
			else
				{
				//scenario 4 (Delete between head and tail of LL)
					Node before = this.head;
						while(before.getNext()!=temp)
							{
								before= before.getNext();
							}
					before.setNext(temp.getNext());
					
				}
		}
	
		}
}

class  Rsquaresoft
{
	public static void main(String[] args) 
	{
		Stack s = new Stack(5);
		s.push(1);
		s.push(1);
		s.pop();
		s.push(1);
		s.display();
		s.push(1);
		s.push(1);
		s.pop();
		s.push(1);
		s.display();
		s.push(1);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	    s.display();
		LinkedList list =new LinkedList();
		list.insertNodeAtStart("one");
		list.insertNodeAtEnd("two");
		list.insertNodeAtEnd("three");
		list.insertNodeAtEnd("four");
		list.insertNodeAtStart("zero");
		list.displayLinkedList();
		list.insertAtPosition("four", "five");
		list.displayLinkedList();
		list.insertNodeAtEnd("six");
		list.insertNodeAtEnd("seven");
		list.insertNodeAtEnd("eight");
		list.displayLinkedList();
		list.deleteNode("one");
		list.displayLinkedList();
		list.deleteNode("eight");
		list.displayLinkedList();
		list.deleteNode("five");
		list.displayLinkedList();






	}
}
