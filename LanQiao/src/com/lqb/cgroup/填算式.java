package com.lqb.cgroup;
/*
 * 看这个算式：
    ☆☆☆ + ☆☆☆ = ☆☆☆
    如果每个五角星代表 1 ~ 9 的不同的数字。
    这个算式有多少种可能的正确填写方法？

    173 + 286 = 459
    295 + 173 = 468
    173 + 295 = 468
    183 + 492 = 675
    以上都是正确的填写法！
    注意：
    111 + 222 = 333 是错误的填写法！
    因为每个数字必须是不同的！ 
    也就是说：1~9中的所有数字，每个必须出现且仅出现一次！
    注意：
    不包括数字“0”！
    注意：
    满足加法交换率的式子算两种不同的答案。
    所以答案肯定是个偶数！

 */
public class 填算式 {
	private static int count = 0;
	//交换
	public static void swap(int[] A, int i, int j) {
		 int temp = A[i];
		 A[i] = A[j];
		 A[j] = temp;
	}

	public static void getCount(int[] arr,int temp) {
		if(temp == arr.length){
			int a = arr[0]*100 + arr[1]*10 + arr[2];
			int b = arr[3]*100 + arr[4]*10 + arr[5];
			int c = arr[6]*100 + arr[7]*10 + arr[8];
			if(a + b ==c) count++;
			return;
		}else{
			for (int i = temp; i < arr.length; i++) {
				swap(arr, i, temp);
				getCount(arr, temp+1);
				swap(arr, i, temp);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int []{1,2,3,4,5,6,7,8,9};
		getCount(arr, 0);
		System.out.println(count);
	}
}
