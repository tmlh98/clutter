package cn.java.ss;
/*
	某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
	现在算起来，他一共吹熄了236根蜡烛。
	请问，他从多少岁开始过生日party的？
	请填写他开始过生日party的年龄数。
 */
public class 生日蜡烛 {
	public static void main(String[] args) {
		for (int i = 2; i < 50; i++) {
			int count = 0;
			for (int j = i; j < 50; j++) {
				count+=j;
				if(count == 236){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
