package cn.java.ss;
/*
 * 
以下的静态方法实现了：把串s中第一个出现的数字的值返回。
如果找不到数字，返回-1

例如：
s = "abc24us43"  则返回2
s = "82445adb5"  则返回8
s = "ab"   则返回-1   

 */
public class 第一个数字 {
	public static int getFirstNum(String s) {
		if (s == null || s.length() == 0)
			return -1;

		char c = s.charAt(0);
		if (c >= '0' && c <= '9')
			return c-48; // 填空

		return getFirstNum(s.substring(1,s.length())); // 填空
	}
	public static void main(String[] args) {
		System.out.println(getFirstNum("abc24us43"));
		System.out.println(getFirstNum("82445adb5"));
		System.out.println(getFirstNum("ab"));
	}
}