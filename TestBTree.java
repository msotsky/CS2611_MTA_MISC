
public class TestBTree {

	public static void main(String[] args) {
		BTree bTree = new BTree();
		BTree bTree2 = new BTree();
		BTree bTree3 = new BTree();
		BTree bTree4 = new BTree();
		
		
		/*		
		 * 
		 * This version of a binary tree uses the level-order
		 * insertion where our input is stored as a tree.
  		 *		Input  : treeArray[] = {1, 2, 3, 4, 5, 6}
		 *		Output : Root of the following tree
		 *                 1
		 *                / \
		 *               2   3
		 *              / \ /
		 *             4  5 6
		 * The root is located in the 0th index of the array
		 * In general, if the parent is at index i, then the 
		 * left child of that node is at index (2*i + 1) and 
		 * the right child is at index (2*i + 2) 
		 */
		
		// Here is a simple tree for you to experiment with:
	    int treeArray[] = {1, 2, 3, 4, 5, 6}; 
		bTree = bTree.insert(treeArray);
		
		int treeArray2[] = {10,5,14,4,7,12,15,6,9,8}; 
		bTree2 = bTree2.insert(treeArray2);
		
		int treeArray3[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16}; 
		bTree3 = bTree3.insert(treeArray3);
		
		int treeArray4[] = {1,2,3}; 
        bTree4 = bTree4.insert(treeArray4);
        
        // The tree with its traversals
	    bTree.traverseInOrder();
	    System.out.println();
	    bTree.traversePreOrder();
	    System.out.println();
		bTree.traversePostOrder();
	    
		// We want to find the height of this tree: so test this with the method you're asked to complete
		System.out.println();
	   System.out.println("bTree: " +bTree.computeTreeHeight());

	   System.out.println();
	   System.out.println("bTree2: " +bTree2.computeTreeHeight());

	   System.out.println();
	   System.out.println("bTree3: " +bTree3.computeTreeHeight());

	   System.out.println();
	   System.out.println("bTree4: " +bTree4.computeTreeHeight());
	}

}
