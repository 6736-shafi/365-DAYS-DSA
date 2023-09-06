package binaryTree;
import java.util.*;

 class Node{
	int data;
	Node left,right;
	 Node(int item) {
		data=item;
		left=null;
		right=null;
	}
}

 class BT {
	
	Node root;

	BT(){
		root =null;
	}
	BT(int data){
		root =new Node(data);
	}
	static void levelorder(Node root) {
		LinkedList<Node> q=new LinkedList<Node>();
		q.addLast(root);
		while(!q.isEmpty()) {
			Node temp= q.removeFirst();
			System.out.print(temp.data+" ");
			
			if(root.left!=null) {
				q.addLast(temp);
			}
			if(root.right!=null) {
				q.addLast(temp);
			}
		}
	}

	public static void main(String[] args) {
		 Node root=new Node(10);
	    	root.left=new Node(20);
	    	root.right=new Node(30);
	    	root.left.left=new Node(40); 
	    //	System.out.println(root.left.left.data);
	    	levelorder(root);
                
		
		

	}

}
