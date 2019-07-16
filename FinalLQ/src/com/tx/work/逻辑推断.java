package com.tx.work;

/*
 * A、B、C、D、E、F、G、H、I、J 共10名学生有可能参加本次计算机竞赛，也可能不参加。因为某种原因，他们是否参赛受到下列条件的约束：
 * 
 * 1. 如果A参加，B也参加；
 * 2. 如果C不参加，D也不参加；
 * 3. A和C中只能有一个人参加；
 * 4. B和D中有且仅有一个人参加；
 * 5. D、E、F、G、H 中至少有2人参加；
 * 6. C和G或者都参加，或者都不参加；
 * 7. C、E、G、I中至多只能2人参加   
 * 8. 如果E参加，那么F和G也都参加。
 * 9. 如果F参加，G、H就不能参加
 * 10. 如果I、J都不参加，H必须参加
 * 请编程根据这些条件判断这10名同学中参赛者名单。如果有多种可能，则输出所有的可能情况。每种情况占一行。参赛同学按字母升序排列，用空格分隔。
 * 比如： 
 * C D G J  就是一种可能的情况。多种情况的前后顺序不重要
 */
public class 逻辑推断 {
	
	static boolean[] state= new boolean[10]; 
	
	private static void check(boolean[] b) {
		if(b[0] == true && b[1] == false) return;
		if(b[2] == false && b[3] == true) return;
		if(b[0] == true && b[2] == true)return;
		if(b[1]&& b[3])return;
		int count = 0;
		for (int i = 3; i < 8; i++) {
			if(b[i])count ++;
		}
		if(count < 2)return ;
		if(!b[2]&&b[6])return ;
		int count2 = 0;
		if(b[2])count2 ++;
		if(b[4])count2 ++;
		if(b[6])count2 ++;
		if(b[8])count2 ++;
		if(count2 > 2)return ;
		
		if((b[4] == true && b[5] == false) || (b[4] == true && b[6] == false))return;
		if((b[5] == true && b[6] == true) || (b[4] == true && b[7] == true))return;
		if(b[8] == false && b[9] == false &&  b[7] == false )return ;
		
		for (int i = 0; i < b.length; i++) {
			if(b[i])System.out.print( (char)( i + 'A' )+ " ");
		}
		System.out.println();
		
	}
	
	private static void dfs(boolean[] b , int step) {
		if(step == b.length){
			check(state);
			return ;
		}
		for (int i = 0; i < 2; i++) {
			boolean temp = b[step];
			if(i == 0){
				b[step] = true;
			}else{
				b[step] = false;
			}
			dfs(b, step + 1);
			b[step] = temp;
		}
		
	}

	public static void main(String[] args) {
		dfs(state , 0);
		
	}
}	
