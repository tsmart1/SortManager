package com.sparta.ts;

public class Node {

    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private int value;

    private static int nodeCounter;

    public Node(Node parent, int value) {
        this.parent = parent;
        this.value = value;
        nodeCounter++;

    }

    public static Node getChildlessNode(Node node, int value) {
        if (node.getLeftChild() == null && node.getValue() >= value) { // Will be left child
            return node;
        } else if (node.getRightChild() == null && node.getValue() < value) { // Will be right child
            return node;
        } else if (node.getValue() >= value) {
            node = Node.getChildlessNode(node.getLeftChild(), value);
        } else if (node.getValue() < value) {
            node = Node.getChildlessNode(node.getRightChild(), value);
        }
        return node;
    }

    public static int getNodeCounter() {
        return nodeCounter;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(int value) {
        this.leftChild = new Node(this, value);
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(int value) {
        this.rightChild = new Node(this, value);
    }

    public Node getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }
}
