package cn.java.ss;
/*
 * �����һ����������ÿһλ��ƽ��������ͣ��õ�һ���µ���������
	���²���������������ͬ���Ĵ���
	���һ������ᷢ�֣����ܿ�ʼȡ����ʲô���֣�
	���������������1����������ͬһ��ѭ��Ȧ��
	��д�����ѭ��Ȧ�������Ǹ����֡�
	����д��������֡�
 */
public class ƽ����Ȧ {
	public static void main(String[] args) {
		int n = 2;
		int max = -1;
		for (int i = 0; i < 100; i++) {
			int count = 0;
			while (n != 0) {
				count += (n % 10) * (n % 10);
				n /= 10;
			}
			System.out.println(count);
			n = count;
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
		System.out.println(f(25));
	}
	
	public static int f(int num) {  
        int max = 0;// ͨ��num����������ֵ  
        while (true) {  
            int temp = 0;// ����num���μ����ֵ  
            while (num != 0) {  
                temp += (num % 10) * (num % 10);  
                num = num / 10;  
            }  
            num = temp;  
            if(max == temp ){  
                break;  
            }else{  
                max = (max > temp) ? max : temp;  
            }  
        }  
        return max;  
    }  
}
