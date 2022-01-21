/**
 *  A simple test class for your levelCount implementation on a binary tree
 */

public class TestTreeFun {

	
	
	public static void main(String[] args) {
		
		// Instantiate a TreeFun object with a null root
		TreeFun<String> myTree = new TreeFun<String>();
		
		// Add nodes to the tree containing the String parameter
		myTree.insert("Mojo Jojo-root"); // first node added...will it be the root? How will we know?
		myTree.insert("Fuzzy Lumpkins-child-on-1");
		myTree.insert("Rowdyruff Boys-child-on-1");
		myTree.insert("Amoeba Boys-child-on-2");
		myTree.insert("Gangreen Gang-child-on-2");
		myTree.insert("Sedusa-child-on-2");
		
		int lCount; 
		for (int i=0; i<5; i++) {
			lCount = myTree.levelCount(myTree.getRoot(),i);
			System.out.println("For i = " + i + ", level count = " + lCount);
		}
		myTree.printTree();

	}

}
