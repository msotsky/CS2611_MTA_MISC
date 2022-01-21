
/**
 * This class implements a priority queue of Nodes.
 * <b>For the assignment, you are to re-write this class
 * so that it uses a heap
 * instead of an unsorted array.</b> The behaviour, of course, should 
 * remain the same.
 * <BR> The priority queue is ordered by the value in each Node.
 */
public class PriorityQueue {

    private Node[] heap;
    private int length;

    //Node heap[];
    //int length;

    /** 
     * Create a new Priority Queue of the specified size.
     * A priority queue has a size and a length. The size is
     * the capacity (how many Nodes <emph>can</emph> be in the priority queue).
     * The length is how many Nodes <emph>are</emph> currently in the priority
     * queue. A new priority queue has a length of zero.
     */
    public PriorityQueue(int size) {
    	heap = new Node[size];
    	length = 0;
    }

    /**
     * Insert the specified Node into the priority queue.
     */
    public void insert(Node n) {
        heap[length++] = n;
        
    }
    
    /**
     * Return the length of (number of Nodes in) the priority queue.
     */
    public int length() {
    	return length;
    }

    /**
     * Your version will return the heap-ordered array.
     * My version returns an unsorted array.
     */
    public Node[] getHeap() {
    	return heap;
    }

    /**
     * Remove and return the minimum Node in the priority queue.
     */
    public Node removeMin() {
	
    	int min;
    	int index;
    	int minindex;
    	Node minNode;

    	/* Let us just assume that we will never be called when the
    	 * queue is empty. Java runtime will give us an error if it isn't.
    	 */
    	minindex = 0;
    	min = heap[0].getValue(); 

    	/* Find the minimum */
    	for (index = 1; index < length; index ++) {
    		if (heap[index].getValue() < min) {
    			min = heap[index].getValue();
    			minindex = index;
    		}
    	}

    	/* Got the minimum */
    	minNode = heap[minindex];

    	/* Now close the gap */
    	for (int shifti = minindex; shifti < length - 1; shifti++) {
    		heap[shifti] = heap[shifti + 1];
    	}
    	length--;
	
    	return minNode;
    }
    private int getParent(int index){
        return index/2;
    }
    private int getLeftChild(int index){
        return index * 2;
    }
    private int getRightChild(int index){
        return (index * 2) + 1;
    }
    
    private Node[] swap(int p1, int p2){
        Node temp;
        temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        return arr;
    }
    private boolean isLeaf(int index){
        if(index >= (length/2) && index <= length)
            return true;
        else
            return false;
    }
    /*
    private void heapify(int index){
        if(isLeaf(index) == false)
            if()
    }
    */
}
