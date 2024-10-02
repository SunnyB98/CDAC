public class BT{
	
	Node root; 	// starting point of tree

	static class Node {
		
		Node left;
		int data;
		Node right;
		
		Node(int data) {
			this.left = null;
			this.data = data;
			this.right = null;
		}
		
	}
	
	public BT() {
		this.root = null;
	}
	
	public BT(int data) {
		this.root = new Node(data);
	}

	
	void printpreOrder(Node node) {
		if(node == null)
			return;

		System.out.print(node.data+" ");
		printpreOrder(node.left);
		printpreOrder(node.right);		
	}
	void printPostOrder(Node node) {
		if(node == null)
			return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.data+" ");		
	}
	void printInOrder(Node node) {
		if(node == null)
			return;

		printInOrder(node.left);
		System.out.print(node.data+" ");
		printInOrder(node.right);		
	}
	
	public static void main(String[] args) {
			
		BT bt = new BT(11);
		//bt.root = new Node(11);	
		bt.root.left = new Node(22);
		bt.root.right = new Node(33);
		bt.root.left.left = new Node(44);
		bt.root.left.right = new Node(55);
		System.out.print("Pre Order : ");
		bt.printpreOrder(bt.root);
		System.out.print("\nIn Order : ");
		bt.printInOrder(bt.root);
		System.out.print("\nPost Order : ");
		bt.printPostOrder(bt.root);
	}
}