//Maxime Sotsky  0270251
//Comp 2611
//oct 15 2020
public class SinglyLinkedList implements List{

	private Node head;
	private int size;
	
	//Constructor 
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}

	private static class Node {
		private Object data; // reference to the data 
		private Node next;	 // reference to the next node
		
		// Constructors
		
		/** Creates a new node with a null next field.
		 * 
		 *  @param dataItem The data we want to store
		 *   
		 */
		
		private Node(Object dataItem) {
			data = dataItem;
			next = null;
		}
		
		/** Creates a new node that references another node.
		 * 
		 *  @param dataItem The data we want to store
		 *  @param nodeRef The node references by the new node
		 *  
		 */
		
		private Node(Object dataItem, Node nodeRef) {
				data = dataItem;
				next = nodeRef;
			}
		
		private Node getNext() {
			return next;
		}
		
		private void setNext(Node aRef) {
			this.next = aRef;
		}
		
		private void setData(Object dataItem) {
			this.data = dataItem;
		}
		
		private Object getData() {
			return this.data;
		}
		
	}
	public void add(Object dataItem){
		this.addFirst(dataItem);
	}
	
	public boolean remove(Object dataItem){
		return true;
	}
	
	public int getSize(){
		return 0;
	}
	
	// Getters and Setters
	
	/** Add an item to the front of the list.
	 * 
	 * @param item The item to be added
	 * 
	 */
	private void addFirst(Object item) {
		head = new Node(item,head);
		size++;
	}
	
	private void addAfter(Node aNode, Object item) {
		// add code here
	}
	
	/** Remove the node after a given node
	 * 
	 * @param aNode The node before the one to be removed
	 * @return The data from the removed node or null if there is no node to remove
	 * 
	 */
	public Object removeAfter(Node aNode) {
		// add code here
	}
	
	/** Remove the first node from the list
	 * 
	 * @return the returned node's data or null if the list is empty
	 * 
	 */
	
	public Object removeFirst() {
		// add code here
	}
	
}
