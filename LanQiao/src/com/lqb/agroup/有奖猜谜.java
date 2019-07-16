package com.lqb.agroup;

/*
 * 小明很喜欢猜谜语。
	最近，他被邀请参加了X星球的猜谜活动。
	
	每位选手开始的时候都被发给777个电子币。
	规则是：猜对了，手里的电子币数目翻倍，
	猜错了，扣除555个电子币, 扣完为止。
	
	小明一共猜了15条谜语。
	战果为：vxvxvxvxvxvxvvx
	其中v表示猜对了，x表示猜错了。
	
	请你计算一下，小明最后手里的电子币数目是多少。
	
	请填写表示最后电子币数目的数字。
 */
public class 有奖猜谜 {
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
