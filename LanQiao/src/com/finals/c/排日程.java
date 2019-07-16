package com.finals.c;

import java.util.ArrayList;


public class 排日程 {
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
    		//2. 一周中，至少有3天所有人都是上班的。
			if(ss[0].charAt(i) == '1' &&ss[1].charAt(i) == '1' &&
					ss[2].charAt(i) == '1' &&ss[3].charAt(i) == '1' &&ss[4].charAt(i) == '1' )count++;
		}
    	if(count < 3)return;
    	//3. 任何一天，必须保证 A B C D 中至少有2人上班。
    	for (int i = 0; i < ss[0].length(); i++) {//7
    		int count2 =0;
			for (int j = 0; j < ss.length -1; j++) {//4
				if(ss[j].charAt(i) == '1')count2++;
			}
			if(count2<2)return;
		}
    	// B D E 在周日那天必须休息。

    	
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
    	//1. 所有人的连续工作日不能多于3天（注意：周日连到下周一也是连续）。
		StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i < 7;i++) {
            if(A[i] == 1) count++;
            sb.append(A[i]);
        }
        if(count == 5 && sb.indexOf("1111") == -1 &&(sb.substring(4) + 
        		sb.substring(0 , 3)).indexOf("1111") == -1)//每周需要工作5天，休息2天
           list.add(sb.toString());
    }
    

}
/*某保密单位机要人员 A，B，C，D，E 每周需要工作5天，休息2天。

    上级要求每个人每周的工作日和休息日安排必须是固定的，不能在周间变更。

    此外，由于工作需要，还有如下要求：

    1. 所有人的连续工作日不能多于3天（注意：周日连到下周一也是连续）。

    2. 一周中，至少有3天所有人都是上班的。

    3. 任何一天，必须保证 A B C D 中至少有2人上班。

    4. B D E 在周日那天必须休息。

    5. A E 周三必须上班。

    6. A C 一周中必须至少有4天能见面（即同时上班）。

    你的任务是：编写程序，列出ABCDE所有可能的一周排班情况。工作日记为1，休息日记为0
    
    A B C D E 每人占用1行记录，从星期一开始。

【输入、输出格式要求】

    程序没有输入，要求输出所有可能的方案。

    每个方案是7x5的矩阵。只有1和0组成。        
    
    矩阵中的列表示星期几，从星期一开始。

    矩阵的行分别表示A，B，C，D，E的作息时间表。

    多个矩阵间用空行分隔开。

    例如，如下的矩阵就是一个合格的解。请编程输出所有解(多个解的前后顺序不重要)。
1101110
1101110

*/
