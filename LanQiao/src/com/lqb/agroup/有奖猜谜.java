package com.lqb.agroup;

/*
 * С����ϲ�������
	�������������μ���X����Ĳ��ջ��
	
	ÿλѡ�ֿ�ʼ��ʱ�򶼱�����777�����ӱҡ�
	�����ǣ��¶��ˣ�����ĵ��ӱ���Ŀ������
	�´��ˣ��۳�555�����ӱ�, ����Ϊֹ��
	
	С��һ������15�����
	ս��Ϊ��vxvxvxvxvxvxvvx
	����v��ʾ�¶��ˣ�x��ʾ�´��ˡ�
	
	�������һ�£�С���������ĵ��ӱ���Ŀ�Ƕ��١�
	
	����д��ʾ�����ӱ���Ŀ�����֡�
 */
public class �н����� {
	public static void main(String[] args) {
		long num = 777;
		char[] arr = "vxvxvxvxvxvxvvx".toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='v'){
				num*=2;
			}else{
				num-=555;
			}
			System.out.println(num);
		}
		System.out.println(num);
		
		
	}
}
