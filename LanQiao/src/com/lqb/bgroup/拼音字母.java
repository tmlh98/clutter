package com.lqb.bgroup;

import java.util.Scanner;

/*
 * 在很多软件中，输入拼音的首写字母就可以快速定位到某个词条。比如，在铁路售票软件中，输入: “bj”就可以定位到“北京”。
 * 怎样在自己的软件中实现这个功能呢？问题的关键在于：对每个汉字必须能计算出它的拼音首字母。
    GB2312汉字编码方式中，一级汉字的3755个是按照拼音顺序排列的。我们可以利用这个特征，对常用汉字求拼音首字母。
    GB2312编码方案对每个汉字采用两个字节表示。第一个字节为区号，第二个字节为区中的偏移号。
    为了能与已有的ASCII编码兼容（中西文混排），区号和偏移编号都从0xA1开始。
    我们只要找到拼音a,b,c,...x,y,z 每个字母所对应的GB2312编码的第一个汉字，就可以定位所有一级汉字的拼音首字母了（不考虑多音字的情况）。
    下面这个表给出了前述信息。请你利用该表编写程序，求出常用汉字的拼音首字母。
    a 啊 B0A1
	b 芭 B0C5
	c 擦 B2C1
	d 搭 B4EE
	e 蛾 B6EA
	f 发 B7A2
	g 噶 B8C1
	h 哈 B9FE
	j 击 BBF7
	k 喀 BFA6
	l 垃 C0AC
	m 妈 C2E8
	n 拿 C4C3
	o 哦 C5B6
	p 啪 C5BE
	q 期 C6DA
	r 然 C8BB
	s 撒 C8F6
	t 塌 CBFA
	w 挖 CDDA
	x 昔 CEF4
	y 压 D1B9
	z 匝 D4D1
	【输入、输出格式要求】
	    用户先输入一个整数n (n<100)，表示接下来将有n行文本。接着输入n行中文串（每个串不超过50个汉字）。
	    程序则输出n行，每行内容为用户输入的对应行的汉字的拼音首字母。
	    字母间不留空格，全部使用大写字母。

 */
public class 拼音字母 {
	public static String zh = "啊芭擦搭蛾发噶哈击喀垃妈拿哦啪期然撒塌挖昔压匝";
	
	public static char[] result = {'A','B','C','D','E','F','G','H','J','K',
        'L','M','N','O','P','Q','R','S','T','W','X','Y','Z'};

	// 将一个汉字（GB2312）转换为十进制表示  
    public static int getNum(char c){  
        byte[] b = null;  
        try {  
            b = (""+c).getBytes("GB2312");  
        } catch (Exception e) {  
            e.printStackTrace();  
        }   // 汉字变为十进制(核心)  
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
