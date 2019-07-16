import java.util.ArrayList;

public class ºÙ” ∆± {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	public static boolean[] visited = new boolean[5];
	public static long count = 0;

	public static void dfs(int step) {
		while (step < A.length) {
			list.add(A[step]);
			if (list.size() == 5) {
				if (check()) {
					System.out.println(list);
					count++;
				}

			}
			step++;
			dfs(step);//µ›πÈ
			list.remove(list.size() - 1);//ªÿÀ›
		}
	}

	public static boolean check() {
		for (int i = 0; i < 5; i++)
			visited[i] = false;
		int start = list.get(0);
		dfsPath(start, 0);
		for (int i = 0; i < 5; i++) {
			if (visited[i] == false)
				return false;
		}
		return true;
	}

	public static void dfsPath(int a, int i) {
		visited[i] = true;
		int start1 = a + 1;
		int start2 = a - 1;
		int start3 = a + 4;
		int start4 = a - 4;
		int r = (a - 1) / 4;
		if (list.contains(start1) && (start1 - 1) / 4 == r
				&& !visited[list.indexOf(start1)])
			dfsPath(start1, list.indexOf(start1));
		if (list.contains(start2) && (start2 - 1) / 4 == r
				&& !visited[list.indexOf(start2)])
			dfsPath(start2, list.indexOf(start2));
		if (list.contains(start3) && !visited[list.indexOf(start3)])
			dfsPath(start3, list.indexOf(start3));
		if (list.contains(start4) && !visited[list.indexOf(start4)])
			dfsPath(start4, list.indexOf(start4));
	}

	public static void main(String[] args) {
		dfs(0);
		System.out.println(count);
	}
}