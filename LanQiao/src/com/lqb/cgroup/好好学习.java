package com.lqb.cgroup;

public class 好好学习 {
	/*
	 * 汤姆跟爷爷来中国旅游。一天，他帮助中国的小朋友贴标语。
	 * 他负责贴的标语是分别写在四块红纸上的四个大字：“好、好、学、习”。但是汤姆不认识汉字，他就想胡乱地贴成一行。
	 * 请你替小汤姆算一下，他这样乱贴，恰好贴对的概率是多少？ 答案是一个分数，请表示为两个整数比值的形式。例如：1/3 或 2/15 等。
	 * 如果能够约分，请输出约分后的结果。
	 */
	public static void main(String[] args) {
		int count = 0, sum = 0;
		String[] str = new String[] { "好", "好", "学", "习" };
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				for (int k = 0; k < str.length; k++) {
					for (int z = 0; z < str.length; z++) {
						// 条件筛选
						if (i != j && i != k && i != z && j != z && j != k
								&& k != z) {
							count++;
							if ((str[i] + str[j] + str[k] + str[z])
									.equals("好好学习"))
								sum++;
						}
					}
				}
			}
		}
		System.out.println(sum + "/" + count);
	}
}
