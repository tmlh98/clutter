package cn.java.ss;
/*
 *  �˾��벦110,��ʹ�ֻ�Ƿ��Ҳ�ɲ�ͨ��
    Ϊ�˱���������򣬱�������Ⱥ�������Ʋ���ȫ������������Ҫ���ﷸ���Ƕ��£������Ҫ�����Եؽ�������ѵ��������ѵ����
    ĳ�������������ڽ�������ѵ����
    1 2 3 4 5 6 7 8 9 = 110;
    �뿴�ϱߵ���ʽ��Ϊ��ʹ��ʽ��������Ҫ�����ּ�����ӺŻ��߼��ţ����Բ�������������������ţ���
    ֮��û��������ŵ�������ϳ�һ���������磺12+34+56+7-8+9 ����һ�ֺϸ�����123+4+5+67-89 ����һ�����ܵĴ𰸡�
    �������ü���������ƣ�����������������ҵ����д𰸡�

    ÿ����ռһ�С����磺
	12+34+56+7-8+9
	123+4+5+67-89
	......
    ��֪�������𰸿�������������Ʒ֡�
    �����𰸵�ǰ��˳����Ҫ��
 */
public class Ȥζ���� {
	public static void main(String[] args) {
		char[] a = {' ', '+','-'};
		char[] c = "123456789".toCharArray();
		for (char x1 : a) 
			for (char x2 : a)
				for (char x3 : a)
					for (char x4 : a)
						for (char x5 : a)
							for (char x6 : a)
								for (char x7 : a)
									for (char x8 : a){
										char[] s = {x1,x2,x3,x4,x5,x6,x7,x8};
										String str ="";//�Á�����ܳ��F����r
										for (int i = 0; i < 8 ; i++) {
											str += c[i]+""+s[i];
										}
										str += c[8];//�������һ������
										str = str.replaceAll(" ", "");//ȥ���ո�
										int result = f(str);
										if(result ==110)
											System.out.println(str);
									}
		
	}

	private static int f(String str) {
		String[] add = str.split("[+]");//���ݼӺŲ��
		int result = 0;
		for (int i = 0; i < add.length; i++) {
			String[] jian = add[i].split("[-]");//�ڸ��ݼ��Ų��
			int n = 0;
			for (int j = 0; j < jian.length; j++) {
				if(jian.length > 1){
					if(n == 0){
						result += Integer.parseInt(jian[j]);
						n++;
					}else{
						result -= Integer.parseInt(jian[j]);
					}
				}else{
					result += Integer.parseInt(jian[j]);
				}
			}
		}
		return result;
	}
}
