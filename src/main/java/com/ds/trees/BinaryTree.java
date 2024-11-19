package com.ds.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class BinaryTree {
	
	private TreeNode root;
	
	private static class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "TreeNode [left=" + left + ", right=" + right + ", data=" + data + "]";
		}
		
	}
	
	public void createBinaryTree() {
		TreeNode f = new TreeNode(1);
		TreeNode s = new TreeNode(2);
		TreeNode t = new TreeNode(3);
		TreeNode f4 = new TreeNode(4);
		TreeNode f5 = new TreeNode(5);
		TreeNode f6 = new TreeNode(6);
		TreeNode f7 = new TreeNode(7);



		root = f;
		f.left = s;
		f.right = t;
		s.left = f4;
		s.right = f5;
		t.left = f6;
		t.right = f7;
	}
	
//	Visit the root.
//	Traverse the left subtree, i.e., call Preorder(left->subtree)
//	Traverse the right subtree, i.e., call Preorder(right->subtree) 
	public void preOrder(TreeNode node) {
		if(node ==  null) {
			return;
		}
		System.out.println("PreOrderData is ..."+node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
//	Traverse the left subtree, i.e., call Inorder(left->subtree)
//	Visit the root.
//	Traverse the right subtree, i.e., call Inorder(right->subtree)
	public void inOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print("In Order Data is "+node.data);
		inOrder(node.right);
	}
	
//	Traverse the left subtree, i.e., call Postorder(left->subtree)
//	Traverse the right subtree, i.e., call Postorder(right->subtree)
//	Visit the root
    public void postOrder(TreeNode node) {
    	if(node == null) {
			return;
		}
    	postOrder(node.left);
    	postOrder(node.right);
		System.out.print("In Order Data is "+node.data);

    	
    }
    
    public void levelOrderIterative() {
    	if(root == null) {
    		return ;
    	}
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		TreeNode temp = queue.poll();
    		System.out.print(temp.data + " ");
    		if(temp.left !=null) {
    			queue.offer(temp.left);
    		}
    		if(temp.right !=null) {
    			queue.offer(temp.right);
    		}
    	}
    }
    
    public void postOrderIterative() {
    	TreeNode current = root;
    	Stack<TreeNode> stack = new Stack<>();
    	while(current!=null || !stack.isEmpty()) {
    		if(current!=null) {
    			stack.push(current);
    			current = current.left;
    		}else {
    			TreeNode temp = stack.peek().right;
    			if(temp == null) {
    				temp = stack.pop();
    				System.out.println(temp.data + " ");
    				while(!stack.isEmpty() && temp == stack.peek().right) {
    					temp = stack.pop();
    					System.out.println(temp.data + " ");
    				}
    			}else {
    				current = temp;
    			}
    		}
    	}
    	
    }
    
    public int findMaxInBinaryTree(TreeNode root) {
    	if(root == null) {
    		return Integer.MIN_VALUE;
    	}
    	int result = root.data;
    	int left = findMaxInBinaryTree(root.left);
    	int right = findMaxInBinaryTree(root.right);
    	if(left > result)
    		result = left;
    	if(right > result)
    		result = right;
    	return result;
    	
    }
	
	public void preOrderIterative() {
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.println(temp.data +" ");
			if(temp.right!=null) { 
				stack.push(temp.right);
			}
			
			if(temp.left !=null) {
				stack.push(temp.left);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		//bt.preOrder();
		//bt.inOrder(bt.root);
		//bt.postOrderIterative();
		//bt.levelOrderIterative();
		System.out.println(bt.findMaxInBinaryTree(bt.root));
	}

}
