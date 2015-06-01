package cn.edu.nju.pipi;

public class BinaryTree {

	private static TreeNode  root;
	public BinaryTree(){
		root =null;
	}
	
	public static void insert(int data){
		TreeNode  newNode = new TreeNode(data);
		if(root == null){
			root = newNode;
		}
		else{
			TreeNode current = root;
			TreeNode parent = null;
			//while 循环找到带插入节点的父节点
			while(current != null){
				parent = current;
				if(data < current.val){
					current = current.left;
				}else{
					current = current.right;
				}
			}
			if(data < parent.val){
				parent.left = newNode;
			}else{
				parent.right = newNode;
			}
		}
	}
	public static void buildTree(int[] a){
		for(int i = 0;i < a.length;i ++){
			insert(a[i]);
		}
	}
	public static TreeNode buildTree2(int[] a){
		buildTree(a);
		return root;
	}
	public static void inOrder(TreeNode localRoot){
		if(localRoot != null){
			inOrder(localRoot.left);
			System.out.println(localRoot.val + " " );
			inOrder(localRoot.right);
		}
	}
	public static void preOrder(TreeNode localRoot){
		if(localRoot != null){
			System.out.println(localRoot.val + " " );
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}
	}
	public static void postOrder(TreeNode localRoot){
		if(localRoot != null){
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.println(localRoot.val + " " );
			
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] data = {2,8,7,4,9,3,1,6,7,5};

		buildTree(data);
		preOrder(root);
	}
	

}
