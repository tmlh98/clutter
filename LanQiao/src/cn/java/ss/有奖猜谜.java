package cn.java.ss;
/*
 * ����ϲ�������
	�������������μ���X����Ĳ��ջ��
	ÿλѡ�ֿ�ʼ��ʱ�򶼱�����777�����ӱҡ�
	�����ǣ��¶��ˣ�����ĵ��ӱ���Ŀ������
	�´��ˣ��۳�555�����ӱ�, ����Ϊֹ��
	С��һ������15�����
	ս��Ϊ��vxvxvxvxvxvxvvx
	����v��ʾ�¶��ˣ�x��ʾ�´��ˡ�
	�������һ�£�С���������ĵ��ӱ���Ŀ�Ƕ��١�
 */
public class �н����� {
	public static void main(String[] args) {
		int money = 777;
		String str = "vxvxvxvxvxvxvvx";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'v'){
				money  = money * 2;
			}else{
				money -= 555;
			}
		}
		if(money < 0){
			money = 0;
		}
		
		System.out.println(money);
	}
}
