package com.finals.c;

import java.util.ArrayList;


public class ���ճ� {
	public static int[] S = {0, 1};
	public static ArrayList<String> list = new ArrayList<String>();
    
    public static void main(String[] args) {
        int[] A = new int [7];
        dfs(A, 0);
        String[] ss = new String [5];
        for (String s1 : list) 
        	 for (String s2 : list) 
        		 for (String s3: list) 
        			 for (String s4: list) 
        				 for (String s5: list){
        					 ss[0] = s1;
        					 ss[1] = s2;
        					 ss[2] = s3;
        					 ss[3] = s4;
        					 ss[4] = s5;
        					 check2(ss);
        				 } 
        				
    }
    private static void check2(String[] ss) {
 
    	int count = 0;
    	for (int i = 0; i < 7; i++) {
    		//2. һ���У�������3�������˶����ϰ�ġ�
			if(ss[0].charAt(i) == '1' &&ss[1].charAt(i) == '1' &&
					ss[2].charAt(i) == '1' &&ss[3].charAt(i) == '1' &&ss[4].charAt(i) == '1' )count++;
		}
    	if(count < 3)return;
    	//3. �κ�һ�죬���뱣֤ A B C D ��������2���ϰࡣ
    	for (int i = 0; i < ss[0].length(); i++) {//7
    		int count2 =0;
			for (int j = 0; j < ss.length -1; j++) {//4
				if(ss[j].charAt(i) == '1')count2++;
			}
			if(count2<2)return;
		}
    	// B D E ���������������Ϣ��

    	
    	if(ss[1].charAt(6) =='1' || ss[3].charAt(6) =='1' ||ss[4].charAt(6) =='1'||
    			ss[0].charAt(2) == '0'||ss[4].charAt(2) == '0')return;
    	int count3=0;
    	for (int i = 0; i < ss[0].length(); i++) {
			if(ss[0].charAt(i) == '1' && ss[2].charAt(i) == '1')count3++;
		}
    	if(count3<4)return; 
    	for (String string : ss) {
			System.out.println(string);
		}
    	System.out.println();
	}
	public static void dfs(int[] A, int step) {
        if(step == A.length) {
        	check(A);
            return;
        }
        for(int i = 0;i < 2;i++) {
            A[step] = S[i];
            dfs(A, step + 1);
            A[step] = -1;
        }
    }
    public static void check(int[] A) {
    	//1. �����˵����������ղ��ܶ���3�죨ע�⣺������������һҲ����������
		StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i < 7;i++) {
            if(A[i] == 1) count++;
            sb.append(A[i]);
        }
        if(count == 5 && sb.indexOf("1111") == -1 &&(sb.substring(4) + 
        		sb.substring(0 , 3)).indexOf("1111") == -1)//ÿ����Ҫ����5�죬��Ϣ2��
           list.add(sb.toString());
    }
    

}
/*ĳ���ܵ�λ��Ҫ��Ա A��B��C��D��E ÿ����Ҫ����5�죬��Ϣ2�졣

    �ϼ�Ҫ��ÿ����ÿ�ܵĹ����պ���Ϣ�հ��ű����ǹ̶��ģ��������ܼ�����

    ���⣬���ڹ�����Ҫ����������Ҫ��

    1. �����˵����������ղ��ܶ���3�죨ע�⣺������������һҲ����������

    2. һ���У�������3�������˶����ϰ�ġ�

    3. �κ�һ�죬���뱣֤ A B C D ��������2���ϰࡣ

    4. B D E ���������������Ϣ��

    5. A E ���������ϰࡣ

    6. A C һ���б���������4���ܼ��棨��ͬʱ�ϰࣩ��

    ��������ǣ���д�����г�ABCDE���п��ܵ�һ���Ű�����������ռ�Ϊ1����Ϣ�ռ�Ϊ0
    
    A B C D E ÿ��ռ��1�м�¼��������һ��ʼ��

�����롢�����ʽҪ��

    ����û�����룬Ҫ��������п��ܵķ�����

    ÿ��������7x5�ľ���ֻ��1��0��ɡ�        
    
    �����е��б�ʾ���ڼ���������һ��ʼ��

    ������зֱ��ʾA��B��C��D��E����Ϣʱ���

    ���������ÿ��зָ�����

    ���磬���µľ������һ���ϸ�Ľ⡣����������н�(������ǰ��˳����Ҫ)��
1101110
1101110

*/
