/**
 * This class represents a node in a tree.
 * Because a Node may have left and right children, it can also represent
 * the root of a tree.
 */
 
public class Node {

    /**
     * Create a leaf node with the specified char and int.
     * A leaf node has no children.
     */
    int value;
    char ch;
    Node leftChild;
    Node rightChild;

    public Node(char ch, int value) {
        this.value = value;
        this.ch = ch;
        leftChild = null;
        rightChild = null;
    }

    /**
     * Create a new Node with the specified Nodes as children.
     * The value of this Node is the sum of the values of its to children
     * Nodes. It has no char value.
     */
    public Node(Node left, Node right) {
        this.value = left.getValue() + right.getValue();
        this.leftChild = left;
        this.rightChild = right;
    }
	
    /**
    * Return the value for this Node.
    */
    public int getValue() {
        return this.value;
    }

    /**
     * Return the left child Node for this Node.
     * Return null if this is a leaf Node (there is no children).
     */
    public Node getLeftNode() {
        return this.leftChild;
    }

    /**
     * Return the right child Node for this Node.
     * Return null if this is a leaf Node (there is no children).
     */
    public Node getRightNode() {
        return this.rightChild;
    }

    /**
     * Return the character for this Node.
     * The return value for a Node with no char is implementation
     * dependant (i.e. you, the implementer, decide).
     */
    public char getChar() {
        return this.ch;
    }

    /**
     * Return true for a leaf node, false otherwise.
     */
    public boolean isLeaf() {
        if(this.getRightNode() == null && this.getLeftNode() == null)
            return true;
        else
            return false;
    }
}
