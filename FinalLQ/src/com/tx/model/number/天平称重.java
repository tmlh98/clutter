package com.tx.model.number;

public class ��ƽ���� {
	 

	public static void main(String[] args) {
		for (int i = 1; i < 122; i++) {
			System.out.println(f(i));
			
		}
		 
	}

	private static String f(int n) {
		String str = "";
		int k = 1;
		while(n > 0){
			int sh = n / 3;
			if(n % 3 == 1)str = "+" +k + str; 
			if(n % 3 == 2){
				str = "-" +k + str; 
				sh ++;
			}
			n = sh; 
			k *= 3; 
		}
		
		
		return str.substring(1);
	}
}
/*����ƽ����ʱ������ϣ���þ������ٵ�������ϳƳ������ܶ��������
	���ֻ��5�����룬�����ֱ���1��3��9��27��81
	�����ǿ�����ϳƳ�1��121֮��������������������������������������У���
	
	����ĿҪ����ʵ�֣����û�����������������������Ϸ�����
	���磺
	�û����룺
	5
	���������
	9-3-1
	�û����룺
	19
	���������
	27-9+1
	
	Ҫ����������������Ǵ�����ǰС���ں�
	���Լ����û�����������ַ��Ϸ�Χ1~121��
*/