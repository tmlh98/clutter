package cn.dzqc.lqbtwo;

import java.util.Scanner;

public class �����ݵı�ʾ {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		calute(n);
	}

	private static void calute(int n) {//�ݹ鿴ϵ��,eg��137-��2^7+2^3+2^0����ʵ�����жϵ�Ϊ��7,3,0��Ȼ�������7���
		String sum=Integer.toBinaryString(n);//ʮ����ת������          10001001
		int []a=new int[sum.length()];
		int k=0;
		for (int i = 0; i < sum.length(); i++) {
			if(sum.charAt(i)=='1'){
				a[k]=sum.length()-1-i;
				k++;
			}
		}
		for (int i = 0; i <=k-1; i++) {//7 3 0
			if(a[i]==0){
				System.out.print("2(0)");
			}else if (a[i]==1) {
				System.out.print("2");
			}else if (a[i]==2) {
				System.out.print("2(2)");
			}else {
				System.out.print("2(");
				calute(a[i]); // �ݹ����
				System.out.print(")");
			}
			if (i != k-1) {
				System.out.print("+");
			}
			
		}
		
	}
}
