package cn.java.ss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * �˾��벦110,��ʹ�ֻ�Ƿ��Ҳ�ɲ�ͨ��
	 Ϊ�˱���������򣬱�������Ⱥ�������Ʋ���ȫ������������Ҫ���ﷸ���Ƕ��£������Ҫ�����Եؽ�������ѵ��������ѵ����
	 ĳ�������������ڽ�������ѵ����
	 1 2 3 4 5 6 7 8 9 = 110;
	
	 �뿴�ϱߵ���ʽ��Ϊ��ʹ��ʽ��������Ҫ�����ּ�����ӺŻ��߼��ţ����Բ�������������������ţ���֮��û��������ŵ�������ϳ�һ������
	 ���磺12+34+56+7-8+9 ����һ�ֺϸ�����123+4+5+67-89 ����һ�����ܵĴ𰸡�
	
	 �������ü���������ƣ�����������������ҵ����д𰸡�
	 ÿ����ռһ�С����磺
	 12+34+56+7-8+9
	 123+4+5+67-89
	 ......
 */
public class Ȥζ��ʽ {
	private static HashSet<String> hashSet = new HashSet<String>(); 
	
	public static void main(String[] args) {
		//����һ������Ϊ17�����飬���1-9��ÿ����֮����һ��λ����Ϊ��������
		char[] c= new char [17];
		char d= '1';
		for (int i = 0; i < c.length; i+=2) {
			c[i] = d++;
		}
		getResult(c, 1);
		for (String hs : hashSet) {
			for (int i = 0; i < hs.length(); i++) {
				if(hs.charAt(i)!='#')System.out.print(hs.charAt(i));
			}
			System.out.println();
		}
	}
	//
	public static void getResult(char[] c,int index){
		//�ݹ��˳�����
		if(index == 17){
			setResult(c);
			return;
		}
		//��ʱ��ʾû�������,
		c[index] = '#';
		//ÿ��ǰ����λ�ҵ���϶
		getResult(c, index + 2);
		c[index] = '+';
		getResult(c, index + 2);
		c[index] = '-';
		getResult(c, index + 2);
		
	}
	//��char���н���
	private static void setResult(char [] c) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		String str = "";
		for (int i = 0; i < c.length; i++) {
			if(c[i] == '+'){
				list1.add(str);
				str = "";
			}else if(c[i] == '-'){
				list2.add(str);
				str = "";
			}else if(c[i] != '#'){
				str += c[i];
			}
			if(i ==16){
				if(c[15] == '+') {
					list1.add(str);
					break;
				}
				if(c[15] == '-'){
					list2.add(str);
					break;
				} 
				if(c[13] == '+') {
					list1.add(str);
					break;
				}
				if(c[13] == '-'){
					list2.add(str);
					break;
				} 
			}
		}
		
		 int sum = 0;
		 for (String string : list1) {
			sum += Integer.valueOf(string); 
		 }
		 for (String string : list2) {
				sum -= Integer.valueOf(string); 
		}
		
		if(sum == 110){
			hashSet.add(new String(c));
		}
		
	}
	
}
