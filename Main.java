
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Unrolled Linked List - Java \n"); 
		
		UnrolledLinkedList list = new UnrolledLinkedList(4);

		list.insert(new Student("Huy", 20));
		list.insert(new Student("Nguyễn", 10));
		list.insert(new Student("Ngọc", 32));
		list.insert(new Student("Nam", 23));
		list.insert(new Student("Trần", 54));
		
		list.printList();
	}
}
