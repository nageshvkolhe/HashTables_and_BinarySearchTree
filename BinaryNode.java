package com.binarysearchtree;


public class BinaryNode<K extends Comparable<K>> {
    K key;
    BinaryNode<K> leftchild; 
    BinaryNode<K> rightchild; 

    public BinaryNode(K key) {
        this.key = key;
        this.leftchild = null;
        this.rightchild = null;
    }
}
