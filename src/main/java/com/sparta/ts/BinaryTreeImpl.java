// getChildlessNode - method inside Node class to search for the left/right node (based on value given) without a child so it has a node to add the value too
// add node - uses the above to find the right node to add to, then uses the set left/right value method we wrote fri night to add
// add nodes - loops as we set up but skips the first int in the array (THIS WON'T WORK IF YOU RUN THE METHOD MULTIPLE TIMES SO WE NEED AN ALT WORKAROUND??)
// BinaryTreeImpl constructor - added addNodes(array) just so it adds the whole array, but as above, this probs needs a different idea
// find node - uses a while loop to (sort of) recurse without needing a new method by keep changing the local variable 'node' with left/right until node w/ value is found (or not)

package com.sparta.ts;

import java.util.ArrayList;

public class BinaryTreeImpl implements BinaryTree, Sort {

    private Node rootNode;

    public BinaryTreeImpl() {}

    public BinaryTreeImpl(int[] array) {
        addNodes(array);
    }

    @Override
    public Node getRootNode() {
        return rootNode;
    }

    @Override
    public int getNumberOfNodes() {
        return Node.getNodeCounter();
    }

    @Override
    public void addNode(int value) {
        if (Node.getChildlessNode(rootNode, value).getValue() >= value) { // null pointer exception
            Node.getChildlessNode(rootNode, value).setLeftChild(value);
        } else if (Node.getChildlessNode(rootNode, value).getValue() < value) {
            Node.getChildlessNode(rootNode, value).setRightChild(value);
        }
    }

    @Override
    public void addNodes(int[] values) {
        for (int i = 0; i < values.length; i++) {
            if (Node.getNodeCounter() == 0){
                this.rootNode = new Node(null, values[0]);
            } else {
                addNode(values[i]);
            }
        }
    }

    @Override
    public boolean findNode(int value) {
        Node node = rootNode;
        while (true) {
            if (node == null) {
                return false;
            } else if (node.getValue() == value) {
                return true;
            } else {
                if (node.getValue() >= value) {
                    node = node.getLeftChild();
                } else if (node.getValue() <= value) {
                    node = node.getRightChild();
                }
            }
        }
    }

    @Override
    public Node getLeftChild(Node node) {
        return node.getLeftChild();
    }

    @Override
    public Node getRightChild(Node node) {
        return node.getRightChild();
    }

    ArrayList<Integer> arrayInOrder = new ArrayList<>();
    @Override
    public int[] getSortedTreeAsc() {
        arrayInOrder.clear(); //clears arrayInOrder so that it  can be called multiple times
        createArrayInOrder(rootNode);
        int[] ascArray = new int[arrayInOrder.size()];
        for (int i = 0; i < arrayInOrder.size(); i++) {
            ascArray[i] = arrayInOrder.get(i);
        }
        return ascArray;
    }
    private void createArrayInOrder(Node node) {
        if (node != null) {
            createArrayInOrder(node.getLeftChild());
            arrayInOrder.add(node.getValue());
            createArrayInOrder(node.getRightChild());
        }
    }
    @Override
    public int[] getSortedTreeDesc() {
        arrayInOrder.clear(); //clears arrayInOrder so that it  can be called multiple times
        int[] ascArray = getSortedTreeAsc(); //uses asc sorted tree as a base for the new desc tree
        int[] descArray = new int[arrayInOrder.size()];
        for (int i = 0; i < ascArray.length; i++) { //reverses asc tree
            descArray[i] = ascArray[ascArray.length - 1 - i];
        }
        return descArray;
    }

    @Override
    public int[] runSort(int[] arrayToSort) {
        return getSortedTreeAsc();
    }
}
