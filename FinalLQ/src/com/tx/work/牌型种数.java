package com.tx.work;
/*
 * С�����ٳֵ�X�ĳǣ�����������3�����ơ�
 * һ���˿��ƣ�ȥ����С���ƣ���52�ţ������ȷ���4���ˣ�ÿ����13�š�
 * ��ʱ��С��������ͻȻð��һ�����⣺
 * ��������ǻ�ɫ��ֻ���ǵ�����Ҳ�������Լ��õ����Ƶ��Ⱥ�˳���Լ��������õ��ĳ�ʼ�������һ���ж������أ�
 */
public class �������� {
	//��52�����г�ȡ13��
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 4; i++)
			for (int i2 = 0; i2 <= 4; i2++)
				for (int i3 = 0; i3 <= 4; i3++)
					for (int i4 = 0; i4 <= 4; i4++)
						for (int i5 = 0; i5 <= 4; i5++)
							for (int i6 = 0; i6 <= 4; i6++)
								for (int i7 = 0; i7 <= 4; i7++)
									for (int i8 = 0; i8 <= 4; i8++)
										for (int i9 = 0; i9 <= 4; i9++)
											for (int j = 0; j <= 4; j++)
												for (int j2 = 0; j2 <= 4; j2++)
													for (int j3 = 0; j3 <= 4; j3++)
														for (int j4 = 0; j4 <= 4; j4++){
															if(i + i2+i3+i4+i5+i6+i7+i8+i9+j+j2+j3+j4 == 13){
																count ++;
																
																
															}
														}
		System.out.println(count);
	}
	
	
}
