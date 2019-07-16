package com.finals.datastruct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: Bitree 
 * @Description: TODO(���ﶨ����һ�ż򵥵����������) 
 * @author ���� E-mail: 1720213210@qq.com 
 * @date 2018-4-16 ����8:05:13
 */
public class BiTree {
	private int v;//�˿�
	
	private BiTree l;//������
	
	private BiTree r;//������
	
	/**
	 * ʹ�ù��������˿ʹ�ֵ
	 */
	public BiTree(int x) {
		this.v = x;
	}
	/**
	 * �ṩ�����������add����
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
	 * �������
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
