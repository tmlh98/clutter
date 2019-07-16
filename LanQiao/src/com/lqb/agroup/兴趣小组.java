package com.lqb.agroup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组
（以下称A组，B组，C组）。
每个小组的学生名单分别在【A.txt】,【B.txt】和【C.txt】中。
每个文件中存储的是学生的学号。

由于工作需要，我们现在想知道：
    既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？
 */
public class 兴趣小组 {
	public static void main(String[] args) throws Exception {
		InputStream is1 =new FileInputStream("src/com/lqb/agroup/A.txt");
		InputStream is2 =new FileInputStream("src/com/lqb/agroup/B.txt");
		InputStream is3 =new FileInputStream("src/com/lqb/agroup/C.txt");
		int data = 0;
		String str1 = "";
		String str2 = "";
		String str3 = "";
		while ((data=is1.read())!=-1) {
			str1 += (char)data;
		}
		while ((data=is2.read())!=-1) {
			str1 += (char)data;
		}
		while ((data=is3.read())!=-1) {
			str2 += (char)data;
		}
		String [] strArr = str1.split(", ");
		//C组
		String [] strArr2 = str2.split(", ");
		
		Set<String> set = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		for (int i = 0; i < strArr.length; i++) {
			if(set.contains(strArr[i])){
				set2.add(strArr[i]);
			}
			set.add(strArr[i]);
		}
		int sum = 0;
		for (int i = 0; i < strArr2.length; i++) {
			set2.add(strArr2[i]);
		}
		for (String string : set) {
			if(!set2.contains(string)){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
