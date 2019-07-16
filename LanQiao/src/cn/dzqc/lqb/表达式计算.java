package cn.dzqc.lqb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 表达式计算 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder expression = new StringBuilder("(" + br.readLine() + ")"); // 表达式，在输入的表达式两边加上括号
		StringBuilder temp = new StringBuilder(); // 存放临时表达式，即每次存放的都是任意一个括号中的子表达式
		while (true) {
			int frontBrackets = expression.lastIndexOf("("); // 从表达式后边开始搜索，找到最后一个"("
			int backBrackets = expression.indexOf(")", frontBrackets); // 从最后一个"("的位置开始往后搜索，找到与之对应的")"
			if (frontBrackets == -1) {
				break; // 若再无表达式需要计算，即expression只有一个整数时，跳出循环
			}
			temp.append(expression.substring(frontBrackets + 1, backBrackets)); // 将此括号中的表达式存入temp
			expression.delete(frontBrackets, backBrackets + 1); // 在原始表达式中将括号连同其中的表达式删除
			for (int i = 0; i < temp.length(); i++) { // 从子表达式中找出运算符，根据运算原则，先乘除后加减
				if (temp.charAt(i) == '*') { // 若找到 "*" ，调用calculation进行运算
					calculation(temp, '*', i);
					i = 0; // 运算完后，i清零，方便下一次从开始位置继续寻找乘除运算符
				}
				if (temp.charAt(i) == '/') {
					calculation(temp, '/', i);
					i = 0;
				}
			}
			for (int i = 0; i < temp.length(); i++) { // 找完乘除运算符后，开始找加减运算符
				if (temp.charAt(i) == '+') {
					calculation(temp, '+', i);
					i = 0;
				}
				if (temp.charAt(i) == '-') {
					calculation(temp, '-', i);
					i = 0;
				}
			}
			expression.insert(frontBrackets, temp); // 运算完后，将结果插入在刚才删除的括号位置，构成新的表达式，继续循环计算
			temp.delete(0, temp.length()); // 将temp清空，方便下一个表达式计算
		}

		System.out.println(expression); // 输出结果
	}

	/**
	 * 计算表达式
	 * 
	 * @param src
	 *            表达式
	 * @param op
	 *            操作符
	 * @param location
	 *            操作符在表达式中的位置
	 */
	private static void calculation(StringBuilder src, char op, int location) {
		int x = 0; // 操作数1
		int y = 0; // 操作数2
		int sum = 0;// sum = x (op)
		String check = "0123456789+-"; // 检测运算符两边的内容是否为其中数组或者正数或负数
		StringBuilder temp = new StringBuilder(); // 存放运算符两边的字符
		if (location == 0)
			return; // 若遇到子表示其中只有加减运算符这种情况，且遇到的第一个运算符其实是想表示一个正数或者负数的符号，则函数返回，继续寻找下一个运算符

		int k = 0; // 搜索操作符左右两边的数
		for (k = location - 1; k >= 0 && check.contains(src.charAt(k) + ""); k--) { // 从运算符左边一个位置开始往前搜索，找到第一个操作数
			try {
				// 若数字前边有两个运算符，第一个是为了与前边的数相连，第二个是为了表示这个数的正负，则跳出循环，执行后面的语句
				// 比如：
				// 5+(7+-5*+10)，搜索到5前边时，先搜索到"-",发现前边还有一个"+"，此时temp中没有运算符，则继续执行，当搜索到"+"时，发现前边没有运算符了，就跳出循环
				if ((src.charAt(k) == '+' || src.charAt(k) == '-')
						&& (src.charAt(k - 1) != '+' || src.charAt(k - 1) != '-'))
					break;
				if (temp.charAt(0) == '+' || temp.charAt(0) == '-')
					break;

			} catch (Exception e) {
				// e.printStackTrace(); //不输出异常，满足题目输出要求
			}

			temp.insert(0, src.charAt(k)); // 每次都是从temp的开始位置插入内容，保证逆向搜索的内容能按照正常的顺序存入temp
			src.deleteCharAt(k); // 删除运算符前边的那个数字，若有正负号，也一并删除
		}

		x = Integer.parseInt(temp.toString()); // 将搜索到的此数存入x
		temp.delete(0, temp.length()); // 将temp清空

		for (k = k + 2; k < src.length() && check.contains(src.charAt(k) + "");) { // 从运算符右边一个位置开始往后搜索，找到第二个操作数，加2是因为上边的循环语句在结束时自减了一次
			if ((src.charAt(k) == '+' || src.charAt(k) == '-')
					&& (temp.length() != 0))
				break;
			temp.append(src.charAt(k));
			src.deleteCharAt(k);
		}

		y = Integer.parseInt(temp.toString());
		temp.delete(0, temp.length());

		switch (op) {
		case '+':
			sum = x + y;
			src.deleteCharAt(k - 1); // 删除运算符
			src.insert(k - 1, sum + ""); // 将结果存入src的操作符位置（此时操作符两边的数已经从src中删除，所以插入此位置相当于用结果代替子表达式，方便下一次运算）
			break;

		case '-':
			sum = x - y;
			src.deleteCharAt(k - 1);
			src.insert(k - 1, sum + "");
			break;

		case '*':
			sum = x * y;
			src.deleteCharAt(k - 1);
			src.insert(k - 1, sum + "");
			break;

		case '/':
			sum = x / y;
			src.deleteCharAt(k - 1);
			src.insert(k - 1, sum + "");
			break;

		default:
			break;
		}
	}
}