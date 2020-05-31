public class UnrolledLinkedList {
	private int size;
	private int capacity;
	private int nodes;
	private Node head;
	private Node tail;
	
	public UnrolledLinkedList(int capacity) { 
		this.size = 0;
		this.capacity = capacity;
		Node.capacity = capacity;
		this.nodes = 0;
		this.head = null;
		this.tail = null;
	}
	
	public int size() {
		return this.size;
	} 
	
	public void insert(Student student) { 
		if (this.head == null) {
			// new node
			Node node = new Node(); 
			this.nodes++;
			node.insert(student);
			this.size++;
			
			this.head = node;
			this.tail = node;
			return;
		}
		
		if (this.tail.size() < this.capacity) { 
			this.tail.insert(student);
			this.size++;
		} else {
			// new node
			Node node = new Node(); 
			this.nodes++;
			node.insert(student);
			this.size++;
			
			this.tail.next = node;
			this.tail = node;
		}
	} 
	
	public void printList() {
		System.out.print("\n-----------"); 
		System.out.print("\nSize = " + this.size); 
		System.out.print("\nNodes = " + this.nodes); 
		System.out.print("\n------------------------");  
		Node currentNode = this.head;
		while (currentNode != null) {
			currentNode.printData();
			currentNode = currentNode.next;
		}
	}
}
