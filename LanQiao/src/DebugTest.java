public class DebugTest {

	public static void main(String[] args) {
		int i = 5;
		int j = 3;
		System.out.println("i=" + i + " j=" + j);
		int max = getMax(i, j);
		System.out.println("max=" + max);
	}

	private static int getMax(int k, int m) {
		int max = 0;
		if (k < m) {
			max = k;
		} else {
			max = m;
		}
		return max;
	}
}
