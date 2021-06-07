package com.binarysearchtree;

public class BinaryTree<K extends Comparable<K>> {
    public BinaryNode<K> rootNode;
    public void add(K key) {
        this.rootNode = this.addNodes(rootNode, key);
    }

    private BinaryNode<K> addNodes(BinaryNode<K> nodeValue, K key) {
        if(nodeValue == null)
            return new BinaryNode<>(key);
        int result = key.compareTo(nodeValue.key);
        if(result == 0)
            return nodeValue;
        else if(result < 0)
            nodeValue.leftchild = addNodes(nodeValue.leftchild, key);
        else
            nodeValue.rightchild = addNodes(nodeValue.rightchild, key);
        return nodeValue;
    }
   
    public int getSize() {
        return this.getSizeRecursively(rootNode);
    }
    private int getSizeRecursively(BinaryNode<K> nodeValue) {
        return nodeValue == null ? 0 : 1 + this.getSizeRecursively(nodeValue.leftchild)+this.getSizeRecursively(nodeValue.rightchild);
    }
}
