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
	//��ʼ�����ڵ�ΪA
	public BinaryTree(){
		this.root = new TreeNode(1, "A");
	}
	/*
	 * ����������
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
	 * ʹ��ǰ����� : ������
	 * @param root
	 */
	public void order(TreeNode root){
		System.out.print(root.data + " ");
		if(root.leftChild != null)order(root.leftChild);
		if(root.rightChild != null)order(root.rightChild);
	}
	/**
	 * ��ǰ�������ĸ�
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
	 * ��ǰ�������ĳ���
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
		System.out.println("\n�߶ȣ�"+hight);
		System.out.println("�ڵ����:"+bTree.getSize());
	}
	
}