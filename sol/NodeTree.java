package sol;

import src.IBST;

/**
 * A NodeTree
 */
public class NodeTree implements IBST {

    private int val;
    private IBST left;
    private IBST right;

    /**
     * Instantiates a BST
     *
     * @param value - The value to be held in the root node.
     * @param left - The left subtree
     * @param right - The right subtree
     */
    public NodeTree(int value, IBST left, IBST right) {
        this.val = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Code for printing out a string representation of the tree - feel free to use
     * in debugging and testing, but don't be too worried about how it works!
     * @param indent
     * @return
     */
    public String stringHelper(int indent) {
        String builder = "src.NodeTree[\n";
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    val=" + this.val + "\n";
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    left=" + this.left.stringHelper(indent + 1);
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    right=" + this.right.stringHelper(indent + 1);
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "]\n";
        return builder;
    }




}
