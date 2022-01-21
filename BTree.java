
public class BTree {
	
	private static class BTNode{
		
		// Instance variables
		
		Object data;
		BTNode leftChild;
		BTNode rightChild;
		
	    // Constructors
		
		BTNode(){
			this.data = null;
			leftChild = null;
			rightChild = null;
		}
		
		BTNode(Object givenData){
			this.data = givenData;
			leftChild = null;
			rightChild = null;
		}
	    
		public Object getData() {
			return this.data;
		}
		
	    public BTNode getLeftChild() {
	    	return this.leftChild;
	    }

	    public BTNode getRightChild() {
	    	return this.rightChild;
	    }
	    
	    public void setLeftChild(BTNode nodeRef) {
	    	this.leftChild = nodeRef;
	    }

	    public void setRightChild(BTNode nodeRef) {
	    	this.rightChild = nodeRef;
	    }
	}
	
	// Instance variables
	
	private BTNode root;
	
	// Constructor
		BTree(){
			root = null;
		}
	
	// Methods
	
		
		public BTree insert(int[] treeArr) {
			BTree filledTree = new BTree();
			filledTree.root = insertLevelOrder( treeArr, null, 0);
			return filledTree;
			
		}
		
		private BTNode insertLevelOrder(int[] treeArr, BTNode root, int i) { 
			// base case 
			if (i < treeArr.length) { 
				BTNode temp = new BTNode(treeArr[i]); 
				root = temp; 
			
				// insert left child 
				root.setLeftChild(insertLevelOrder(treeArr, root.getLeftChild(), 2 * i + 1)); 
			
				// insert right child 
				root.setRightChild(insertLevelOrder(treeArr, root.getRightChild(), 2 * i + 2)); 
			} 
			return root; 
		} 	

	
	// Tree traversals
	
	public void traverseInOrder() {
		this.traverseInOrder(root);
	}
	
	private void traverseInOrder(BTNode nodeRef) {
	    if (nodeRef != null) {
	        traverseInOrder(nodeRef.getLeftChild());
	        System.out.print(" " + nodeRef.getData());
	        traverseInOrder(nodeRef.getRightChild());
	    }
	}
	
	public void traversePreOrder() {
		this.traversePreOrder(root);
	}
	
	private void traversePreOrder(BTNode nodeRef){
		if(nodeRef != null){	
	        System.out.print(" " + nodeRef.getData());
			traversePreOrder(nodeRef.getLeftChild());
			traversePreOrder(nodeRef.getRightChild());
		}

    }

	public void traversePostOrder() {
		this.traversePostOrder(root);
	}
	
	private void traversePostOrder(BTNode nodeRef){
		if(nodeRef != null){	
			traversePostOrder(nodeRef.getLeftChild());
			traversePostOrder(nodeRef.getRightChild());
	        System.out.print(" " + nodeRef.getData());
        }

	}
	
	
	// Here is the public call for the compute height method. It is completed for you.
	public int computeTreeHeight() {
		return this.computeTreeHeight(root);
	}
	
	// COMPLETE THIS METHOD
	// Start by sketching out a small example on paper and try tracing the code on that example
	// and determine what information is missing in the computation of the height of a tree. 
	public int max(int x,int y){
		if(x > y)
			return x;
		if(y > x)
			return y;
		else
			return x;
	}
	private int computeTreeHeight(BTNode nodeRef){
		if (nodeRef == null)
			return -1;
	    if (nodeRef.getLeftChild() == null){
	    	if (nodeRef.getRightChild() == null)
	    		return 0;	
			else{
				return -1;// Missing Code #1
			}
				
	    }
	    else{
	    	int h1 = computeTreeHeight(nodeRef.getLeftChild());
	        if (nodeRef.getRightChild() == null)
				return 1 + h1;
	        else{
				int h2 = computeTreeHeight(nodeRef.getRightChild());
				return 1+ max(h1,h2); // Missing code #2

	        }
	    }
	}

	
}
