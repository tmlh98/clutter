package cn.java.ss;
/*
 * ��Щ���ֵ�������ĩβ�����Ǹ����ֱ���
���磺1,4,5,6,9,24,25,....

�������һ�£���10000���ڵ������У�ָ�����֣����������������ֵ�����������������������һ���ж��ٸ���
 */
public class ����β���� {
	public static void main(String[] args) {
		int count = 0;
		for (long i = 1; i <= 10000; i++) {
			String str=i+"";
			String str2=(i*i*i)+"";
			String str3=str2.substring(str2.length()-str.length(),str2.length());
			if(str3.equals(str)){
				count++;
			}
		}
		System.out.println(count);
	}
}
