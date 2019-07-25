package com.ananth.tree;

public class Tree {
	
	private Node root;
	
	public Tree () {
		root = null;
	}

	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			if(current == null)
				return null;
		}
		return current;
		
	}
	
	public void insert(int id, int dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		//handle empty tree
		if(root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				//key smaller than current node, traverse left
				if(id < current.iData) {
					current = current.leftChild;
					if(current == null ) {
						parent.leftChild = newNode;
						return;
					}
				} else {//key greater than current node, traverse right
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public boolean delete(int key) {
		
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		
		while(current.iData != key) {
			parent = current;
			if(key<current.iData) {
				current = current.leftChild;
				isLeftChild = true;
			} else {
				current = current.rightChild;
				isLeftChild = false;
			}
			if(current == null) {
				return false;
			}
		}
		
		//1. Node to be deleted has no children (it is a leaf)
		if(current.leftChild== null && current.rightChild == null) {
			//handle root
			if(current == root)
				root = null;
			if(isLeftChild) 
				parent.leftChild = null;
			else
				parent.rightChild = null;
		} //2a. Node to be deleted has left child
		else if(current.rightChild == null){
			if(current == root) 
				root = current.leftChild;
			else if(isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;
		} //2b. Node to be deleted has right child
		else if(current.leftChild == null) {
			if(current == root)
				root = current.rightChild;
			else if(isLeftChild)
				parent.leftChild = current.rightChild;
			else
				parent.rightChild = current.rightChild;
		} //4. Node to be deleted has 2 children
		else {
			Node successor = getSuccessor(current);
			if(current == root)
				root = successor;
			else if(isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			
			// connect successor to current’s left child
			successor.leftChild = current.leftChild;
		}
		return true;
	}
	
	public Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}//when successor is not the rightChild itself
		if(successor!= delNode.rightChild) {
			//as successor will not have leftChild
			//successor is itself the left most child
			successorParent.leftChild = successor.rightChild;
			//connect delNode to successor by connecting 
			//its rightChild to successor's rightChild
			successor.rightChild = delNode.rightChild;
		}
		//when successor is rightChild, it will be returned directly
		return successor;
	}
	
	public void traverse(int traverseType) {
		switch(traverseType) {
			case 1: 
				System.out.print("\nInorder traversal: "); 
				inOrderTraversal(root);
				break;
			case 2:
				System.out.print("\nPreorder traversal: "); 
				preOrderTraversal(root);
				break;
			case 3:
				System.out.print("\nPostorder traversal: "); 
				postOrderTraversal(root);
				break;
		}
		System.out.println(); 
	}
	
	public void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.leftChild);
			System.out.println(root.iData +" ");
			inOrderTraversal(root.rightChild);
		}
	}
	
	
	public void preOrderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.iData +" ");
			preOrderTraversal(root.leftChild);
			preOrderTraversal(root.rightChild);
		}
	}
	
	public void postOrderTraversal(Node root) {
		if(root!=null) {
			postOrderTraversal(root.leftChild);
			postOrderTraversal(root.rightChild);
			System.out.println(root.iData +" ");
		}
	}

}
