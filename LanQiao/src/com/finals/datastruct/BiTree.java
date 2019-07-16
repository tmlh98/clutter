package com.finals.datastruct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: Bitree 
 * @Description: TODO(这里定义了一颗简单的排序二叉树) 
 * @author 作者 E-mail: 1720213210@qq.com 
 * @date 2018-4-16 下午8:05:13
 */
public class BiTree {
	private int v;//乘客
	
	private BiTree l;//左子树
	
	private BiTree r;//右子树
	
	/**
	 * 使用构造器给乘客传值
	 */
	public BiTree(int x) {
		this.v = x;
	}
	/**
	 * 提供排序二叉树的add方法
	 */
	public void add(BiTree the){
		if(the.v < v){
			if(l == null)l = the;
			else l.add(the);
		}else{
			if(r == null)r = the;
			else r.add(the);
		}
	}
	/**
	 * 中序遍历
	 */
	public void  middle_trav(){
		if(l != null)l.middle_trav();
		System.out.println(v);
		if(l != null)r.middle_trav();
	}
	
	
	public ArrayList<Integer> PrintFromTopToBottom(BiTree root) {  
        ArrayList<Integer> list = new ArrayList<Integer>();  
        if(root==null){  
            return list;  
        }  
          
        Queue<BiTree> queue = new LinkedList<BiTree>();  
        queue.offer(root);  
        while(!queue.isEmpty()){  
        	BiTree node = queue.poll();  
            list.add(node.v);  
            if(node.l!=null){  
                queue.offer(node.l);  
            }  
            if(node.r!=null){  
                queue.offer(node.r);  
            }  
        }  
        return list;  
    }  
}
