
public class TestCircularArrayQueue {
	
	public static void main(String[] args) {

        CircularArrayQueue<Integer> caQueue = new CircularArrayQueue<Integer>(8);

        caQueue.enqueue(1);
        caQueue.enqueue(2);
        caQueue.enqueue(3);
        caQueue.enqueue(4);
        caQueue.enqueue(5);
        caQueue.enqueue(6);
        caQueue.enqueue(7);
        caQueue.enqueue(8);

        System.out.println("Here is a full queue" + caQueue);
        System.out.println();
        try {
			System.out.println("Here is the element at the front of the queue " + caQueue.peek());
		} catch (EmptyCollectionException e) {
			e.printStackTrace();
		}
        System.out.println();

        try {
			System.out.println("The following element was dequeued " + caQueue.dequeue() + " ");
		} catch (EmptyCollectionException e) {
			e.printStackTrace();
		}
        
        System.out.println(caQueue);
        try {
			System.out.println("Here is the element at the front of the queue " + caQueue.peek());
		} catch (EmptyCollectionException e) {
			e.printStackTrace();
		}
        System.out.println();
       
        System.out.println("Here is the queue after enqueueing an element with the value 13");
        caQueue.enqueue(23);
        System.out.println(caQueue);        
        try {
			System.out.println("Here is the element at the front of the queue " + caQueue.peek());
		} catch (EmptyCollectionException e) {
			e.printStackTrace();
		}
    }

}
