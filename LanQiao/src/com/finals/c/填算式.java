package com.finals.c;

public class 填算式 {
	public static void main(String[] args) {
		int[] arr = new int []{1,2,3,4,5,6,7,8,9};
		f(arr,0);
		System.out.println(count);
	}

	
	static int count =0;	
	private static void f(int[] arr, int k) {
		if(arr.length== k){
			int a = arr[0]*100 + arr[1] * 10 + arr[2];
			int b = arr[3]*100 + arr[4] * 10 + arr[5];
			int c = arr[6]*100 + arr[7] * 10 + arr[8];
			if(a + b == c ){
				System.out.println(a+" + "+b + "=" + c);
				count ++;	
			}
			return ;
		}
		
		for (int i = k; i < arr.length; i++) {
			{int temp = arr[i];arr[i] =arr[k];arr[k]=temp;}
			f(arr, k +1);
			{int temp = arr[i];arr[i] =arr[k];arr[k]=temp;}
		}
		
	}
}
/* 看这个算式：
    ☆☆☆ + ☆☆☆ = ☆☆☆
    如果每个五角星代表 1 ~ 9 的不同的数字。
    这个算式有多少种可能的正确填写方法？
+ 286 = 459
+ 173 = 468
+ 295 = 468
+ 492 = 675
    以上都是正确的填写法！
    注意：
+ 222 = 333 是错误的填写法！
    因为每个数字必须是不同的！ 
    也就是说：1~9中的所有数字，每个必须出现且仅出现一次！
    注意：
    不包括数字“0”！
    注意：
    满足加法交换率的式子算两种不同的答案。
    所以答案肯定是个偶数！
    注意：
    只要求计算不同的填法的数目
    不要求列出所有填写法
    更不要求填写源代码！

*/