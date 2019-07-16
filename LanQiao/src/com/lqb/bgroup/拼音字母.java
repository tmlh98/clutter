package com.lqb.bgroup;

import java.util.Scanner;

/*
 * �ںܶ�����У�����ƴ������д��ĸ�Ϳ��Կ��ٶ�λ��ĳ�����������磬����·��Ʊ����У�����: ��bj���Ϳ��Զ�λ������������
 * �������Լ��������ʵ����������أ�����Ĺؼ����ڣ���ÿ�����ֱ����ܼ��������ƴ������ĸ��
    GB2312���ֱ��뷽ʽ�У�һ�����ֵ�3755���ǰ���ƴ��˳�����еġ����ǿ�����������������Գ��ú�����ƴ������ĸ��
    GB2312���뷽����ÿ�����ֲ��������ֽڱ�ʾ����һ���ֽ�Ϊ���ţ��ڶ����ֽ�Ϊ���е�ƫ�ƺš�
    Ϊ���������е�ASCII������ݣ������Ļ��ţ������ź�ƫ�Ʊ�Ŷ���0xA1��ʼ��
    ����ֻҪ�ҵ�ƴ��a,b,c,...x,y,z ÿ����ĸ����Ӧ��GB2312����ĵ�һ�����֣��Ϳ��Զ�λ����һ�����ֵ�ƴ������ĸ�ˣ������Ƕ����ֵ��������
    ��������������ǰ����Ϣ���������øñ��д����������ú��ֵ�ƴ������ĸ��
    a �� B0A1
	b �� B0C5
	c �� B2C1
	d �� B4EE
	e �� B6EA
	f �� B7A2
	g �� B8C1
	h �� B9FE
	j �� BBF7
	k �� BFA6
	l �� C0AC
	m �� C2E8
	n �� C4C3
	o Ŷ C5B6
	p ž C5BE
	q �� C6DA
	r Ȼ C8BB
	s �� C8F6
	t �� CBFA
	w �� CDDA
	x �� CEF4
	y ѹ D1B9
	z �� D4D1
	�����롢�����ʽҪ��
	    �û�������һ������n (n<100)����ʾ����������n���ı�����������n�����Ĵ���ÿ����������50�����֣���
	    ���������n�У�ÿ������Ϊ�û�����Ķ�Ӧ�еĺ��ֵ�ƴ������ĸ��
	    ��ĸ�䲻���ո�ȫ��ʹ�ô�д��ĸ��

 */
public class ƴ����ĸ {
	public static String zh = "���Ų���귢��������������Ŷž��Ȼ��������ѹ��";
	
	public static char[] result = {'A','B','C','D','E','F','G','H','J','K',
        'L','M','N','O','P','Q','R','S','T','W','X','Y','Z'};

	// ��һ�����֣�GB2312��ת��Ϊʮ���Ʊ�ʾ  
    public static int getNum(char c){  
        byte[] b = null;  
        try {  
            b = (""+c).getBytes("GB2312");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }   // ���ֱ�Ϊʮ����(����)  
        return (b[0]<<8&0xff00) + (b[1]&0xff);  
    }  
    public static char[] getResult(String str){
    	int[] demo = new int [26];
    	int[] user = new int [str.length()];
    	for (int i = 0; i < zh.length(); i++) {
			demo[i] = getNum(zh.charAt(i));
		}
    	for (int i = 0; i < str.length(); i++) {
    		user[i] = getNum(str.charAt(i));
		}
    	char[] c = new char[str.length()];
    	for (int i = 0; i < c.length; i++) {
			c[i] = 'Z';
		}
    	for (int i = 0; i < user.length; i++) {
			for (int j = 0; j < demo.length - 1; j++) {
				if(user[i] >= demo[j] && user[i] < demo[j+1]){
					c[i] = result[j];
				}
			}
		}
    	
		return c;
    	
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			char [] c =getResult(str);
			String st = new String(c);
			System.out.println(st);
		}
		sc.close();
	}

}
