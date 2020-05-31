
public class Node {
	public static int capacity;
	private Student students[];
	private int size;
	
	public Node next;
	
	public Node() {
		this.students = new Student[Node.capacity];
		this.size = 0;
		this.next = null;
	}
	
	public int size() {
		return this.size;
	}  
	
	public void insert(Student student) {
		if (this.size >= Node.capacity) return;
		
		students[this.size] = student;
		this.size++; 
	} 
	
	public void printData() {
		for (int i = 0; i < this.size; i++) {
			this.students[i].printInfo();
		}
	} 
}
