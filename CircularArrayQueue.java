
import java.util.Arrays;

public class CircularArrayQueue<E> implements QueueADT<E>{
	
	// Instance variables
	
    private int currentSize; 			//current size of Circular Queue
    private int maxSize; 				//maximum size of Circular Queue 
    private E[] circularQueue;
    private int front; 					//front position of Circular Queue     
    private int rear;					//rear position of Circular Queue

    // Constructor
    
    public CircularArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueue = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = 0;
        rear = 0;
    }

    // Methods: standard to a queue
    
    /**
     * Enqueue elements to rear.
     */
    public void enqueue(E item) {
    	
        if (isFull()) {
        	expandCapacity(); // if the queue is full, double the capacity
        }
        else {
            circularQueue[rear] = item;
            rear = (rear + 1) % circularQueue.length;
            currentSize++;
        }
    }

    /**
     * Dequeue element from Front.
     */     
    public E dequeue() throws EmptyCollectionException {
        E deQueuedElement;
        if (isEmpty()) {
        	throw new EmptyCollectionException ("queue");
        }
        else {
            deQueuedElement = circularQueue[front];
            circularQueue[front] = null; 	// Note that instead of just ignoring the contents of a deleted element, here the object reference is set to null
            front = (front + 1) % circularQueue.length;
            currentSize--;
        }
        return deQueuedElement;
    }

    /**
     * Check but do not remove the first element
     */
    public E peek() throws EmptyCollectionException {
    	if (isEmpty()) {
    		throw new EmptyCollectionException ("queue");
    	}
    	return circularQueue[front];
    }
    
    /**
     * Check if queue is full.
     */
    public boolean isFull() {
        return (currentSize == circularQueue.length);
    }

    /**
     * Check if Queue is empty.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    
    public int getSize() {
    	return currentSize;
    }
    /**
     *  Creates a new array to store the contents of the queue with
     *  twice the capacity of the old one.
     */
    private void expandCapacity(){
    	E[] larger = (E[])(new Object[circularQueue.length *2]);   

    	for(int scan=0; scan < currentSize; scan++){
    		larger[scan] = circularQueue[front];
    		front=(front+1) % circularQueue.length;
    	}

    	front = 0;
    	rear = currentSize;
    	circularQueue = larger;
    }

    // toString override
    
    @Override
    public String toString() {
        return "Contents of the circular queue " + Arrays.toString(circularQueue);
    }


}


