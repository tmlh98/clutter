package cn.java.ss;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * ��������
��   ������n����������ȡ��m���������ȡʹ����m�����ĳ˻�����أ�
	�����ʽ
	������һ��һ������ʾ��������
	����ÿ���������ݹ�2�У�
	������1�и����ܹ������ֵĸ���n��Ҫȡ�����ĸ���m��1<=n<=m<=15��
	������2�����θ�����n����������ÿ�����ֵķ�Χ����:a[i]�ľ���ֵС�ڵ���4��
	�����ʽ
	����ÿ���������1�У�Ϊ���ĳ˻���
	��������
	1
	5 5
	1 2 3 4 2
	�������
	48 
 */
public class ���˻� {
    public static long n, m, temp;
    public static ArrayList<Long> list = new ArrayList<Long>();//����������
    public static ArrayList<Long> result = new ArrayList<Long>();
    
    public static void getResult() {
        Collections.sort(list);
        for(int i = 0, j = list.size() - 1;m > 0;) {
            if(m >= 2) {
                long a1 = list.get(i) * list.get(i + 1);
                long a2 = list.get(j) * list.get(j - 1);
                if(a2 > a1) {
                    temp *= list.get(j);
                    j--;
                    m--;
                } else {
                    temp *= a1;
                    i = i + 2;
                    m = m - 2;
                }    
            } else {
                if(m == 1) {
                    temp *= list.get(j);
                    j--;
                    m--;
                }
            }
        }
        result.add(temp);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0) {
            t--;
            n = in.nextLong();
            m = in.nextLong();
            temp = 1;
            list.clear();
            for(int i = 0;i < n;i++) {
                long a = in.nextLong();
                list.add(a);
            }
            getResult();
        }
        for(int i = 0;i < result.size();i++)
            System.out.println(result.get(i));
        
        in.close();
    }
    
}