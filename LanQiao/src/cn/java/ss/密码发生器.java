package cn.java.ss;

import java.util.Scanner;

/*
 * 
 �ڶ������˻�����ҪȨ�����������ʱ�����ǳ������������ķ��գ����Ϊ�˺ü������հɣ����ױ��ƽ⣬����ȫ��
 ������ò��üǵ����룬�ֵ����Լ�Ҳ�����ǣ����д��ֽ�ϣ�����ֽ�ű����˷��ֻ�Ū����...
 ��������������ǰ�һ��ƴ����ĸת��Ϊ6λ���֣����룩�����ǿ���ʹ���κκüǵ�ƴ����
 (�������֣���ϲ������д��wangximing)��Ϊ���룬�������6λ���֡�

 �任�Ĺ������£�
 ��һ��. ���ַ���6��һ���۵�����������wangximing���Ϊ��
 wangxi
 ming 

 �ڶ���. �����д�ֱ��ͬһ��λ�õ��ַ���ascii��ֵ��ӣ��ó�6�����֣�����������ӣ���ó���
 228 202 220 206 120 105

 ������. �ٰ�ÿ�����֡���λ���������ǰ�ÿ��λ��������ӣ��ó��������������һλ���֣�������λ��
 ֱ�����һλ����Ϊֹ������: 228 => 2+2+8=12 => 1+2=3

 �����������λ���Ϊ��344836, ����ǳ������յ���������

 Ҫ�����ӱ�׼����������ݣ��ڱ�׼�������������

 �����ʽΪ����һ����һ������n��<100������ʾ�±��ж��������У���������n���ַ��������ǵȴ��任���ַ�����
 �����ʽΪ��n�б任���6λ���롣
 875843
 */
public class ���뷢���� {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		String arr[] = new String [n]; 
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			arr[i] = getResult(str);
		}
		for (String string : arr) {
			System.out.println(string);
		}
		sc.close();
	}

	private static String getResult(String str) {
		//����ڶ�����6������
		int[] arr = new int [6];
		for (int i = 0; i < str.length(); i++) {
			arr[i%6] += str.charAt(i);
		}
		String s="";
		for (int i = 0; i < arr.length; i++) {
			s+=get(arr[i]);
		}
		return s;
	}
	//��������
	public static int get(int n){
		int sum=0;
        if (n < 10) return n;//����Ǹ�λ�ͷ���
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
	    return get(sum);

	}
}
