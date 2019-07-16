package cn.java.ss;
/*
 * 明很喜欢猜谜语。
	最近，他被邀请参加了X星球的猜谜活动。
	每位选手开始的时候都被发给777个电子币。
	规则是：猜对了，手里的电子币数目翻倍，
	猜错了，扣除555个电子币, 扣完为止。
	小明一共猜了15条谜语。
	战果为：vxvxvxvxvxvxvvx
	其中v表示猜对了，x表示猜错了。
	请你计算一下，小明最后手里的电子币数目是多少。
 */
public class 有奖猜谜 {
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
