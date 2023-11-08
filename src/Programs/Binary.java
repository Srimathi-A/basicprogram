package Programs;

class node{
	 int item;
	 node left,right;
	 public node(int key) {
		 item=key;
		 left=right=null;
	 }
}

public class Binary {
   node root;
   Binary(){
   	root=null;
   }
   void inorder(node node) {
   	if(node==null)
   		return;
   	inorder(node.left);
   	System.out.print(node.item+ "->");
   	inorder(node.right);
   }
   void preorder(node node) {
   	if(node==null)
   		return;
   	System.out.print(node.item+ "->");
   	preorder(node.left);
   	preorder(node.right);
   }
   void postorder(node node) {
   	if(node==null)
   		return;
   	postorder(node.left);
   	postorder(node.right);
   	System.out.print(node.item+ "->");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Binary tree = new Binary();
     tree.root=new node(1);
     tree.root.left=new node(12);
     tree.root.left=new node(6);
     tree.root.left=new node(2);
     tree.root.right=new node(13);
     tree.root.right=new node(9);
     tree.root.left=new node(8);
     tree.root.right=new node(8);
     tree.root.right=new node(3);
     System.out.println("\nInorder traversal");
		tree.inorder(tree.root);
		System.out.println("\nPreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\nPostorder traversal");
		tree.postorder(tree.root);

     
	}

}

