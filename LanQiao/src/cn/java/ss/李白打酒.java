package cn.java.ss;

public class ��״�� {
/*
 *  һ�죬�����žƺ����Ӽ���������ƺ����о�2���������߱߳���
		    ���½����ߣ����ȥ��ơ�
		    ����һ����������һ����
    ��һ·�ϣ���һ��������5�Σ�������10�Σ���֪���һ���������ǻ��������ðѾƺȹ��ˡ� 
    ����������������ͻ��Ĵ��򣬿��԰������Ϊa��������Ϊb����babaabbabbabbbb ���Ǻ���Ĵ���
    �������Ĵ�һ���ж����أ������������п��ܷ����ĸ�����������Ŀ�����ģ���

 */
	static int count = 0;
	//a:����Ĵ���    b:�����Ĵ���  c���ƻ��м���
	public static void result(int a , int b ,int c){
		//��14��ʱ�ƻ�ʣ1��
		if(c == 1 && a == 5 && b == 9){
			count++;
			return ;
		}
		if(a == 6 || b ==10){
			return ;
		}
		//����һ��
		result(a+1 , b ,c * 2);
		//������һ��
		result(a , b +1,c-1);
	}
	
	public static void main(String[] args) {
		result(0,0,2);
		System.out.println(count);
	}
}
