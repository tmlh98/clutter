package cn.java.eight;
/*
 * A,2,3,4,5,6,7,8,9 ��9��ֽ���ų�һ���������Σ�A��1���㣩��Ҫ��ÿ���ߵĺ���ȡ� 
	��ͼ����һ���ŷ������ж������⣬�ο�p1.png����
	          A
	         9 6
	        4   8
	       3 7 5 2
	       �����ŷ����ܻ��кܶࡣ
	���������ת���������ͬ����ͬһ�֣�һ���ж����ֲ�ͬ���ŷ��أ�
	������㲢�ύ�����֡�
 */
public class ֽ�������� {
	static int count = 0;
	public static void main(String[] args) {
		char[] c = "123456789".toCharArray();
		run(c , 0);
		System.out.println(count/2);//432
	}

	private static void run(char[] c , int k) {
		if(k == c.length){
			int aa = c[0] +c[1] +c[3]+c[5];
			int bb = c[0] +c[2] +c[4]+c[8];
			int cc = c[5] +c[6] +c[7]+c[8];
			if(aa != bb || aa!= cc||bb!=cc)return;
			count ++;
		}
		for (int i = k; i < c.length; i++) {
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
				run(c, k+1);
			{char temp = c[i];c[i] = c[k]; c[k] = temp;}
		}
		
	}
}
