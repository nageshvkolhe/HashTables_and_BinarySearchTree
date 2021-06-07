package com.binarysearchtree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void test() {
	BinaryTree<Integer> bst = new BinaryTree<>();
	  bst.add(56);
	  bst.add(30);
      bst.add(70);
	  int size = bst.getSize();
	  Assertions.assertEquals(3, size);
	}

}
