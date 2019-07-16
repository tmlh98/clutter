package cn.dzqc.lqb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ���ʽ���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder expression = new StringBuilder("(" + br.readLine() + ")"); // ���ʽ��������ı��ʽ���߼�������
		StringBuilder temp = new StringBuilder(); // �����ʱ���ʽ����ÿ�δ�ŵĶ�������һ�������е��ӱ��ʽ
		while (true) {
			int frontBrackets = expression.lastIndexOf("("); // �ӱ��ʽ��߿�ʼ�������ҵ����һ��"("
			int backBrackets = expression.indexOf(")", frontBrackets); // �����һ��"("��λ�ÿ�ʼ�����������ҵ���֮��Ӧ��")"
			if (frontBrackets == -1) {
				break; // �����ޱ��ʽ��Ҫ���㣬��expressionֻ��һ������ʱ������ѭ��
			}
			temp.append(expression.substring(frontBrackets + 1, backBrackets)); // ���������еı��ʽ����temp
			expression.delete(frontBrackets, backBrackets + 1); // ��ԭʼ���ʽ�н�������ͬ���еı��ʽɾ��
			for (int i = 0; i < temp.length(); i++) { // ���ӱ��ʽ���ҳ����������������ԭ���ȳ˳���Ӽ�
				if (temp.charAt(i) == '*') { // ���ҵ� "*" ������calculation��������
					calculation(temp, '*', i);
					i = 0; // �������i���㣬������һ�δӿ�ʼλ�ü���Ѱ�ҳ˳������
				}
				if (temp.charAt(i) == '/') {
					calculation(temp, '/', i);
					i = 0;
				}
			}
			for (int i = 0; i < temp.length(); i++) { // ����˳�������󣬿�ʼ�ҼӼ������
				if (temp.charAt(i) == '+') {
					calculation(temp, '+', i);
					i = 0;
				}
				if (temp.charAt(i) == '-') {
					calculation(temp, '-', i);
					i = 0;
				}
			}
			expression.insert(frontBrackets, temp); // ������󣬽���������ڸղ�ɾ��������λ�ã������µı��ʽ������ѭ������
			temp.delete(0, temp.length()); // ��temp��գ�������һ�����ʽ����
		}

		System.out.println(expression); // ������
	}

	/**
	 * ������ʽ
	 * 
	 * @param src
	 *            ���ʽ
	 * @param op
	 *            ������
	 * @param location
	 *            �������ڱ��ʽ�е�λ��
	 */
	private static void calculation(StringBuilder src, char op, int location) {
		int x = 0; // ������1
		int y = 0; // ������2
		int sum = 0;// sum = x (op)
		String check = "0123456789+-"; // �����������ߵ������Ƿ�Ϊ�������������������
		StringBuilder temp = new StringBuilder(); // �����������ߵ��ַ�
		if (location == 0)
			return; // �������ӱ�ʾ����ֻ�мӼ����������������������ĵ�һ���������ʵ�����ʾһ���������߸����ķ��ţ��������أ�����Ѱ����һ�������

		int k = 0; // �����������������ߵ���
		for (k = location - 1; k >= 0 && check.contains(src.charAt(k) + ""); k--) { // ����������һ��λ�ÿ�ʼ��ǰ�������ҵ���һ��������
			try {
				// ������ǰ�����������������һ����Ϊ����ǰ�ߵ����������ڶ�����Ϊ�˱�ʾ�������������������ѭ����ִ�к�������
				// ���磺
				// 5+(7+-5*+10)��������5ǰ��ʱ����������"-",����ǰ�߻���һ��"+"����ʱtemp��û��������������ִ�У���������"+"ʱ������ǰ��û��������ˣ�������ѭ��
				if ((src.charAt(k) == '+' || src.charAt(k) == '-')
						&& (src.charAt(k - 1) != '+' || src.charAt(k - 1) != '-'))
					break;
				if (temp.charAt(0) == '+' || temp.charAt(0) == '-')
					break;

			} catch (Exception e) {
				// e.printStackTrace(); //������쳣��������Ŀ���Ҫ��
			}

			temp.insert(0, src.charAt(k)); // ÿ�ζ��Ǵ�temp�Ŀ�ʼλ�ò������ݣ���֤���������������ܰ���������˳�����temp
			src.deleteCharAt(k); // ɾ�������ǰ�ߵ��Ǹ����֣����������ţ�Ҳһ��ɾ��
		}

		x = Integer.parseInt(temp.toString()); // ���������Ĵ�������x
		temp.delete(0, temp.length()); // ��temp���

		for (k = k + 2; k < src.length() && check.contains(src.charAt(k) + "");) { // ��������ұ�һ��λ�ÿ�ʼ�����������ҵ��ڶ�������������2����Ϊ�ϱߵ�ѭ������ڽ���ʱ�Լ���һ��
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
			src.deleteCharAt(k - 1); // ɾ�������
			src.insert(k - 1, sum + ""); // ���������src�Ĳ�����λ�ã���ʱ���������ߵ����Ѿ���src��ɾ�������Բ����λ���൱���ý�������ӱ��ʽ��������һ�����㣩
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