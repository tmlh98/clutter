package com.tx.model.recursion;

public class �˻ʺ� {
	
	static int count = 0;//��������
	
	static final int QUEEN = 8;//8���ʺ�
	
	static int[] cols = new int [QUEEN];//����cols���飬��ʾ8�����ӻʺ�ڷŵ�λ��
	
	/**
	 * @param n ����n�еĻʺ�
	 */
	public static void f(int n) {
		boolean [] rows = new boolean[QUEEN];//��¼ÿ��ÿ�������Ƿ���ԷŻʺ�
		
		for (int i = 0; i < n; i++) {
			rows[cols[i]] = true;
			int d = n - i;//б�Խ�
			//��б����
			if(cols[i]-d>=0){
				rows[cols[i] -d] = true;
			}
			//��б����
			if(cols[i]+d<=(QUEEN-1)){
				rows[cols[i]+d] = true;
			}
		}
		//����֪������Щλ�ò��ܷŻʺ�
		for(int i = 0;i<QUEEN;i++){
			if(rows[i]){
				//���ܷ�
				continue;
			}
			cols[n] = i;
			if(n<QUEEN-1){
				f(n+1);
			}else{
				//�ҵ�������һ�׷���
				count++;
				printQueen();
			}
			//���������Ȼ�кϷ�λ��
		}
		
	}
	
	private static  void printQueen() {
		System.out.println("��"+count+"�ַ���");
		for(int i = 0;i<QUEEN;i++){
			for(int j = 0;j<QUEEN;j++){
				if(i == cols[j]){
					System.out.print("0 ");
				}else{
					System.out.print("+ ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		f(0);
	}

	
	
}
