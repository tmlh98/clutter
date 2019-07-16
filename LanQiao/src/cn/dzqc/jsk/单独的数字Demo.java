package cn.dzqc.jsk;
import java.util.Arrays;

public class ����������Demo {
    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 4, 4, 5 };
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }
        System.out.println();
        System.out.println(findNumber(a, a.length));
    }

    public static int findNumber(int a[], int n) {
        int bits[] = new int[32];
        Arrays.fill(bits, 0);
        int i, j;
        for (i = 0; i < n; i++)
            for (j = 0; j < 32; j++)
                bits[j] += ((a[i] >> j) & 1);
        // ���ĳλ�ϵĽ�����ܱ���������϶�Ŀ����������һλ��Ϊ
        int result = 0;
        for (j = 0; j < 32; j++)
            if (bits[j] % 3 != 0)
                result += (1 << j);
        return result;
    }
}