package cn.java.ss;
/*
 * 如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
	对新产生的正整数再做同样的处理。
	如此一来，你会发现，不管开始取的是什么数字，
	最终如果不是落入1，就是落入同一个循环圈。
	请写出这个循环圈中最大的那个数字。
	请填写该最大数字。
 */
public class 平方怪圈 {
	public static void main(String[] args) {
		int n = 2;
		int max = -1;
		for (int i = 0; i < 100; i++) {
			int count = 0;
			while (n != 0) {
				count += (n % 10) * (n % 10);
				n /= 10;
			}
			System.out.println(count);
			n = count;
			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
		System.out.println(f(25));
	}
	
	public static int f(int num) {  
        int max = 0;// 通过num计算出的最大值  
        while (true) {  
            int temp = 0;// 保存num本次计算的值  
            while (num != 0) {  
                temp += (num % 10) * (num % 10);  
                num = num / 10;  
            }  
            num = temp;  
            if(max == temp ){  
                break;  
            }else{  
                max = (max > temp) ? max : temp;  
            }  
        }  
        return max;  
    }  
}
