package cn.java.ss;
/*
 * С���ոտ����Ӱ����39��̨�ס����뿪��ӰԺ��ʱ��������������ǰ��̨������ǡ����39��!

    վ��̨��ǰ����ͻȻ������һ�����⣺

    �����ÿһ��ֻ������1����2��̨�ס�������ţ�Ȼ�����ҽ��棬
    ���һ�������ҽţ�Ҳ����˵һ��Ҫ��ż��������ô������39��̨�ף��ж����ֲ�ͬ���Ϸ��أ�

    �������ü���������ƣ�����С��Ѱ�Ҵ𰸡�
 */
public class ��39��̨�� {
	public static void main(String[] args) {
		System.out.println(getResult(39));
		System.out.println(getResult(39)/2);
	}
	
	public static int getResult(int a){
		if(a <= 1){
			return 1;
		}
		
		return getResult(a-1)+getResult(a-2);
	}
}
