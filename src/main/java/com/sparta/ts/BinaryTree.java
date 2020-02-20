package com.sparta.ts;

public interface BinaryTree {

    Node getRootNode();

    int getNumberOfNodes();

    void addNode(int value);

    void addNodes(int[] values);

    boolean findNode(int value);

    Node getLeftChild(Node node);

    Node getRightChild(Node node);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
