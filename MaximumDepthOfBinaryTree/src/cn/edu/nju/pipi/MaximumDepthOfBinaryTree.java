package cn.edu.nju.pipi;

import java.util.Stack;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		int[] data = {2,8,7,4,9,3,1,6,7,5};
		TreeNode root = BinaryTree.buildTree2(data);
		//BinaryTree.inOrder(root);
		System.out.println(maxDepth2(root));
	}

	public static int maxDepth(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		int maxLevel = 1;
		if(root == null){
			return 0;
		}
		stack.push(root);
		TreeNode node = null;
		//maxLevel = 1;
		while((stack.peek()) != null){
			node = stack.pop();
			if(node.left != null || node.right != null){
				maxLevel ++;
				if(node.left != null){
					stack.push(node);
				}
				if(node.right != null){
					stack.push(node);
				}
			}
			
		}
		
		
		return maxLevel;
	}
	//递归来做
	public static int maxDepth2(TreeNode root) {

		if(root == null){
			return 0;
		}
		//等于左子树和右子树较大者 + 1
		return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
		
		
		//return 0;
	}

}
