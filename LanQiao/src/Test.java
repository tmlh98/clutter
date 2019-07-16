
class BiTree{
	
	int val;
	
	BiTree left;
	
	BiTree right;
	
	public BiTree(int x) {
		val = x;
	}
	
	public void add(BiTree the){
		if(val > the.val){//·Åµ½×ó±ß
			if(left == null)left = the;
			else left.add(the);
		}else{
			if(right == null)right = the;
			else right.add(the);
		}
	}
	
	public void middle(BiTree the){
		if(the.left != null) middle(the.left);
		System.out.println(the.val);
		if(the.right != null) middle(the.right);
	}
}


public class Test {
	public static void main(String[] args) {
		BiTree root = new BiTree(100);
		root.add(new BiTree(20));
		root.add(new BiTree(70));
		root.add(new BiTree(90));
		root.add(new BiTree(120));
		root.middle(root);
		
	}
}
