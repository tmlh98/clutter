package cn.java.ss;
/*
 * 有一堆煤球，堆成三角棱锥形。具体：1 4  10 20
	第一层放1个，
	第二层3个（排列成三角形），
	第三层6个（排列成三角形），
	第四层10个（排列成三角形），
	....
	如果一共有100层，共有多少个煤球？
 */
public class 煤球数目 {
	public static void main(String[] args) {
		int count = 0;
		
		int[] arr =new int [100];
		arr[0] = 1;
		
		for (int i = 1; i < arr.length; i ++) {
			arr[i] = arr[ i -1] + i +1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
		System.out.println(count);
	}
	
}
