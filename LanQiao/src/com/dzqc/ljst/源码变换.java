package com.dzqc.ljst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class 源码变换 {
	public static String process(String s) {
        StringBuilder t = new StringBuilder("");
        char[] A = s.toCharArray();
        for(int i = 0;i < A.length;i++) {
            if(A[i] == '&')
                t.append("&amp;");
            else if(A[i] == ' ')
                t.append("&nbsp;");
            else if(A[i] == '>')
                t.append("&gt;");
            else if(A[i] == '<')
                t.append("&lt;");
            else if(A[i] == '"')
                t.append("&quot;");
            else if(A[i] == '\t')
                t.append("&nbsp;&nbsp;&nbsp;&nbsp;");
            else
                t.append(A[i]);
        }
        String r = t.toString();
        r = r.replaceAll("public", "<b>public</b>");
        r = r.replaceAll("static", "<b>static</b>");
        r = r.replaceAll("class", "<b>class</b>");
        r = r.replaceAll("void", "<b>void</b>");
        int n = r.lastIndexOf("//");
        if(n != -1) {
            String temp = r.substring(n);
            r = r.replaceAll(temp, "<font color=green>"+temp+"</font>");
        }
        r = r + "<br/>\n";
        return r;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader("a.txt"));
        PrintWriter psw = new PrintWriter("b.html");
        String s;
        psw.write("<html><body>\n");
        while((s = read.readLine()) != null) {
            psw.write(process(s));
        }
        psw.write("</body></html>");
        read.close();
        psw.close();
        //System.out.println("转换成功！！！");
    }

}
