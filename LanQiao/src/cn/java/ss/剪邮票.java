package cn.java.ss;

/*
 *  �硾ͼ1.jpg��, ��12������һ���12��Ф����Ʊ��
	������Ҫ���м���5������Ҫ����������ŵġ�
	����������һ���ǲ���������
	���磬��ͼ2.jpg������ͼ3.jpg���У��ۺ�ɫ��ʾ���־��Ǻϸ�ļ�ȡ��
	������㣬һ���ж����ֲ�ͬ�ļ�ȡ������
	+--+--+--+--+
   	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |  |
	+--+--+--+--+
	|  |  |  |	|
	+--+--+--+--+
 */
public class ����Ʊ {
	//�������
	static int cc[][] = {
        {1,1,0,0,1,0,0,0,0,0,0,0},
        {1,1,1,0,0,1,0,0,0,0,0,0},
        {0,1,1,1,0,0,1,0,0,0,0,0},
        {0,0,1,1,0,0,0,1,0,0,0,0},
        {1,0,0,0,1,1,0,0,1,0,0,0},
        {0,1,0,0,1,1,1,0,0,1,0,0},
        {0,0,1,0,0,1,1,1,0,0,1,0},
        {0,0,0,1,0,0,1,1,0,0,0,1},
        {0,0,0,0,1,0,0,0,1,1,0,0},
        {0,0,0,0,0,1,0,0,1,1,1,0},
        {0,0,0,0,0,0,1,0,0,1,1,1},
        {0,0,0,0,0,0,0,1,0,0,1,1},
};

	public static void main(String[] args) {
		int sum = 0;
		// ���ѭ��ɸѡ���
//		for (int i = 0; i < 8; i++) {
//			for (int j = i + 1; j < 9; j++) {
//				for (int j2 = j + 1; j2 < 10; j2++) {
//					for (int k = j2 + 1; k < 11; k++) {
//						for (int k2 = k + 1; k2 < 12; k2++) {
//							if (f(new int[] { i, j, j2, k, k2 })) {
//								System.out.println(i + 1 + " " + (j + 1) + " "
//										+ (j2 + 1) + " " + (k + 1) + " "
//										+ (k2 + 1));
//								sum++;
//							}
//						}
//					}
//				}
//			}
//		}
		int[] c = {7,8,9,10,11};
		System.out.println(f(c));
		System.out.println(sum);
	}
	//�ж��Ƿ�����
	//��һ�ж�ÿ����ѡ�е�λ���Ƿ��ܹ���������λ��
	private static boolean f(int[] is) {
		int index = 0,count = 0;//�±�,����
		int[][] ss =new int [5][2];
		for (int i : is) {
			boolean flag = false;
			for (int j : is) {
				if(cc[i][j] == 1 && i != j){
					if(!flag){
						System.out.println(i+","+j);
						ss[index][0] =i;
						ss[index][1] =j;
						index++;
						count++;
						flag = true;
					}
				}
			}
		}
		if(count == 5){
			int count2=0;
			for (int i = 0; i < 5; i++) {
				for (int j = i; j < ss.length; j++) {
					if(ss[i][0] == ss[j][1] && ss[i][1] == ss[j][0]){
						count2++;
					}
				}
			}
			if(count2>1){
				return false;
			}		
			return true;
		}
		return false;
	}
}
