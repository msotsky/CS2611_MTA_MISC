// Weiting Li, Max Stosky, Lopsii Olagoke

public class TestPriorityQueue {
    public static void main(String[] args) {

//        To check if a tree satisfies the max-heap property, we just do a linear
//        scan through the heap array, starting from the end and check each index's
//        parent node value; if the current value is greater than the parent value,
//        return false.

//        boolean check_Max_Heap(int[] arr_maxheap){
//             from i = arr_maxheap.length-1 to 1:
//                  if arr_maxheap[i] >  arr_maxheap[(i-1)/2] :
//                    return false;
//             return true;
//        }

        PriorityQueue pq = new PriorityQueue(9);
        Node E = new Node('E',4);
        Node A = new Node('A',5);
        Node C = new Node('C',7);
        Node F = new Node('F',12);
        Node D = new Node('D',15);
        Node B = new Node('B',25);
        Node G = new Node('G',6);
        Node H = new Node('H',3);
        Node I = new Node('I',2);
        Node[] arr = pq.getArray();

        pq.insert(E);
        pq.insert(A);
        pq.insert(C);
        pq.insert(F);
        pq.insert(D);
        pq.insert(B);
        pq.insert(G);
        pq.insert(H);
        pq.insert(I);
        printArr(arr);

        System.out.println("The removed value is "+pq.remove().getValue());
        printArr(arr);
        System.out.println("The removed value is "+pq.remove().getValue());
        printArr(arr);
        System.out.println("The removed value is "+pq.remove().getValue());
        printArr(arr);
    }

    public static void printArr(Node[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getValue()+" ");
        }
        System.out.println();
    }
}
