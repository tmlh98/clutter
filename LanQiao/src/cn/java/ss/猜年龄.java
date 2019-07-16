package cn.java.ss;

/*
 *  美国数学家维纳(N.Wiener)智力早熟，11岁就上了大学。他曾在1935~1936年应邀来中国清华大学讲学。

 一次，他参加某个重要会议，年轻的脸孔引人注目。于是有人询问他的年龄，他回答说：

 “我年龄的立方是个4位数。我年龄的4次方是个6位数。这10个数字正好包含了从0到9这10个数字，每个都恰好出现1次。”

 请你推算一下，他当时到底有多年轻。
 */
public class 猜年龄 {
	public static void main(String[] args) {
		for (int i = 11; i < 50; i++) {
			int a= i*i*i;
			int b= i*i*i*i;
			
			if((a+"").length()==4&&(b+"").length()==6){
				System.out.println(i+"  "+a+""+b);
			}
		}
	}
}
