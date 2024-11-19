package com.ds.trees;

public class BinarySearchTree {
	private TreeNode root;

	private static class TreeNode {
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
	
	
	public boolean isValidBST(TreeNode root,int min,int max) {
		if(root ==  null) {
			return true;
		}
		if(root.data <= min || root.data >= max) {
			return false;
		}
		boolean leftValid = isValidBST(root.left, min, root.data);
		
		if(leftValid) {
			boolean rightValid = isValidBST(root.right, root.data, max);
			return rightValid;
			
		}
		return false;
		
	}
	
	public void insert(int data) {
		root = insertIntoBST(root,data);
	}
	
	
	public TreeNode insertIntoBST(TreeNode root,int data) {
		if(root == null) {
			root = new TreeNode(data);
			return root;
		}
		if(data < root.data) {
			root.left = insertIntoBST(root.left, data);
		}else {
			root.right = insertIntoBST(root.right, data);
		}
		return root;
	}
	
	public TreeNode searchBSTByKey(TreeNode root,int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(key < root.data) {
			return searchBSTByKey(root.left, key);
		}else {
			return searchBSTByKey(root.right, key);
		}
	}
	static int maxValue(TreeNode node)
	{
		if (node == null) {
		return Integer.MIN_VALUE;
		}
		int value = node.data;
		int leftMax = maxValue(node.left);
		int rightMax = maxValue(node.right);

		return Math.max(value, Math.max(leftMax, rightMax));
	}

	static int minValue(TreeNode node)
	{
		if (node == null) {
		return Integer.MAX_VALUE;
		}
		int value = node.data;
		int leftMax = minValue(node.left);
		int rightMax = minValue(node.right);

		return Math.min(value, Math.min(leftMax, rightMax));
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(11);
		bst.insert(13);
		bst.insert(16);
		bst.isValidBST(bst.root, bst.root.data,bst.root.data);


	}

}
