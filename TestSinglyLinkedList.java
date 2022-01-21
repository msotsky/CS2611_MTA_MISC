

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.addFirst("Hello");
	        Node myNode = new Node(" there ");
		System.out.println(myList.getSize());
		myList.addFirst(" world ");
		System.out.println(myList.getSize());
		
	}

}
