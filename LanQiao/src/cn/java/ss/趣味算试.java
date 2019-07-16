package cn.java.ss;
/*
 *  匪警请拨110,即使手机欠费也可拨通！
    为了保障社会秩序，保护人民群众生命财产安全，警察叔叔需要与罪犯斗智斗勇，因而需要经常性地进行体力训练和智力训练！
    某批警察叔叔正在进行智力训练：
    1 2 3 4 5 6 7 8 9 = 110;
    请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号（可以不填，但不能填入其它符号）。
    之间没有填入符号的数字组合成一个数，例如：12+34+56+7-8+9 就是一种合格的填法；123+4+5+67-89 是另一个可能的答案。
    请你利用计算机的优势，帮助警察叔叔快速找到所有答案。

    每个答案占一行。形如：
	12+34+56+7-8+9
	123+4+5+67-89
	......
    已知的两个答案可以输出，但不计分。
    各个答案的前后顺序不重要。
 */
public class 趣味算试 {
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
										String str ="";//用來保存可能出現的情況
										for (int i = 0; i < 8 ; i++) {
											str += c[i]+""+s[i];
										}
										str += c[8];//补充最后一个数字
										str = str.replaceAll(" ", "");//去除空格
										int result = f(str);
										if(result ==110)
											System.out.println(str);
									}
		
	}

	private static int f(String str) {
		String[] add = str.split("[+]");//根据加号拆分
		int result = 0;
		for (int i = 0; i < add.length; i++) {
			String[] jian = add[i].split("[-]");//在根据减号拆分
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
