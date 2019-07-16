package com.tx.work;

/*
 * A��B��C��D��E��F��G��H��I��J ��10��ѧ���п��ܲμӱ��μ����������Ҳ���ܲ��μӡ���Ϊĳ��ԭ�������Ƿ�����ܵ�����������Լ����
 * 
 * 1. ���A�μӣ�BҲ�μӣ�
 * 2. ���C���μӣ�DҲ���μӣ�
 * 3. A��C��ֻ����һ���˲μӣ�
 * 4. B��D�����ҽ���һ���˲μӣ�
 * 5. D��E��F��G��H ��������2�˲μӣ�
 * 6. C��G���߶��μӣ����߶����μӣ�
 * 7. C��E��G��I������ֻ��2�˲μ�   
 * 8. ���E�μӣ���ôF��GҲ���μӡ�
 * 9. ���F�μӣ�G��H�Ͳ��ܲμ�
 * 10. ���I��J�����μӣ�H����μ�
 * ���̸�����Щ�����ж���10��ͬѧ�в���������������ж��ֿ��ܣ���������еĿ��������ÿ�����ռһ�С�����ͬѧ����ĸ�������У��ÿո�ָ���
 * ���磺 
 * C D G J  ����һ�ֿ��ܵ���������������ǰ��˳����Ҫ
 */
public class �߼��ƶ� {
	
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
