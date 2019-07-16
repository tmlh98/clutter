package cn.java.ss;

/*
 *  小明是个急性子，上小学的时候经常把老师写在黑板上的题目抄错了。
	 有一次，老师出的题目是：36 x 495 = ?
	 他却给抄成了：396 x 45 = ?
	 但结果却很戏剧性，他的答案竟然是对的！！
	 因为 36 * 495 = 396 * 45 = 17820
	 类似这样的巧合情况可能还有很多，比如：27 * 594 = 297 * 54
	 假设 a b c d e 代表1~9不同的5个数字（注意是各不相同的数字，且不含0）
	 能满足形如： ab * cde = adb * ce 这样的算式一共有多少种呢？
	 请你利用计算机的优势寻找所有的可能，并回答不同算式的种类数。
	 满足乘法交换律的算式计为不同的种类，所以答案肯定是个偶数。
 */
public class 马虎的算式 {
	public static void main(String[] args) {
		int count= 0;
		for (int i = 1; i < 10; i++) {
			for (int i2 = 1; i2 < 10; i2++) {
				if(i==i2) continue;
				for (int i3 = 1; i3 < 10; i3++) {
					if(i==i3||i2==i3)continue;
					for (int i4 = 1; i4 < 10; i4++) {
						if(i==i4||i2==i4||i3==i4) continue;
						for (int i5 = 1; i5 < 10; i5++) {
							if(i==i5||i2==i5||i3==i5||i4==i5) continue;
							if((i*10+i2)*(i3*100+i4*10+i5)==((i*100+i4*10+i2)*(i3*10+i5))){
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
