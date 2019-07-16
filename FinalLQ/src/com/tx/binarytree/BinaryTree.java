package com.tx.binarytree;

class TreeNode{
	int index ;
	
	String data;
	
	TreeNode leftChild;
	
	TreeNode rightChild;
	
	public TreeNode(int index , String data){
		this.index = index;
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
	}
}
public class BinaryTree {
	
	TreeNode root = null;
	//初始化根节点为A
	public BinaryTree(){
		this.root = new TreeNode(1, "A");
	}
	/*
	 * 构建二叉树
	 *         A
	 *    B       C
	 * D     E        F
	 */
	public void createBinartTree(){
		TreeNode B = new TreeNode(2, "B");
		TreeNode C = new TreeNode(3, "C");
		TreeNode D = new TreeNode(4, "D");
		TreeNode E = new TreeNode(5, "E");
		TreeNode F = new TreeNode(6, "F");
		root.leftChild = B;
		root.rightChild = C;
		B.leftChild = D;
		B.rightChild = E;
		C.rightChild = F;
	}
	/**
	 * 使用前序遍历 : 根左右
	 * @param root
	 */
	public void order(TreeNode root){
		System.out.print(root.data + " ");
		if(root.leftChild != null)order(root.leftChild);
		if(root.rightChild != null)order(root.rightChild);
	}
	/**
	 * 求当前二叉树的高
	 * @param args
	 */
	private int getHight(){
		return getHight(root);
	}
	private int getHight(TreeNode root2) {
		if(root2 != null){
			int l = getHight(root2.leftChild) + 1;
			int r = getHight(root2.rightChild) + 1;
			return l > r ? l : r;
		}
		return 0;
	}
	/**
	 * 求当前二叉树的长度
	 * @param args
	 */
	private int getSize(){
		return getSize(root);
	}
	private int getSize(TreeNode node) {
		if(node != null)return getSize(node.leftChild) + 1 + getSize(node.rightChild);
		return 0;
	}
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		bTree.createBinartTree();
		bTree.order(bTree.root);
		int hight = bTree.getHight();
		System.out.println("\n高度："+hight);
		System.out.println("节点个数:"+bTree.getSize());
	}
	
}