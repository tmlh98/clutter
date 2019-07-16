package cn.java.ss;

public class 李白打酒 {
/*
 *  一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：
		    无事街上走，提壶去打酒。
		    逢店加一倍，遇花喝一斗。
    这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。 
    请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 就是合理的次序。
    像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。

 */
	static int count = 0;
	//a:遇店的次数    b:遇花的次数  c：酒还有几斗
	public static void result(int a , int b ,int c){
		//第14次时酒还剩1斗
		if(c == 1 && a == 5 && b == 9){
			count++;
			return ;
		}
		if(a == 6 || b ==10){
			return ;
		}
		//逢店加一倍
		result(a+1 , b ,c * 2);
		//遇花喝一斗
		result(a , b +1,c-1);
	}
	
	public static void main(String[] args) {
		result(0,0,2);
		System.out.println(count);
	}
}
