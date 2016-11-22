package eu.sig.training.ch03;

import eu.sig.training.ch03.TreeException;
import eu.sig.training.ch03.BinaryTreeNode;

public class BinaryTreeSearch {

    void compareNodeValues(param) {
            if (param == null) {
                throw new TreeException("Value not found in tree!");
            } else {
                return 1 + calculateDepth(param, nodeValue);
            }
    }
    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        if(node == null){
        	throw new IllegalArgumentException("A reference to argument 'node' was not specified");
        }
    	int depth = 0;
        void compareValues()
        if (node.getValue() == nodeValue) {
            return depth;
        } else {
            if (nodeValue < node.getValue()) {
                BinaryTreeNode<Integer> left = node.getLeft();
                compareNodeValues(left);
            } else {
                BinaryTreeNode<Integer> right = node.getRight();
                compareNodeValues(right);
                }
            }
        }
    }
    // end::calculateDepth[]
}
