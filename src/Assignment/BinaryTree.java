package Assignment;

import Assignment.BinaryTree;
import Assignment.Node;

class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}

public class BinaryTree {
	Node root;
	BinaryTree(){
		root=null;
	}
	void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.item+"->");
		inOrder(node.right);
	}
	void preOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.item+" ->");
		preOrder(node.left);
		preOrder(node.right);
		
	
	}
	void postorder (Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+" ->");
	}

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);
		System.out.println("\nInorder traversal");
		tree.inOrder(tree.root);
		System.out.println("\nPreorder traversal");
		tree.preOrder(tree.root);
		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);

	}

}

