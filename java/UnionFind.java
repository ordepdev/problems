public class UnionFind {

	private int[] id;
	private int count;
	
	public UnionFind(int N) {
		count = N;
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private void validateIndex(int p) {
		int N = id.length;
		if (p < 0 || p >= N) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void union(int p, int q) {
		validateIndex(p);
		validateIndex(q);
		
		int pId = id[p];
		int qId = id[q];

		if (pId == qId) return;
		
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pId) id[i] = qId;
		}
		count--;
	}
	
	public int find(int p) {
		validateIndex(p);
		return id[p];
	}
	
	public boolean connected(int p, int q) {
		validateIndex(p);
		validateIndex(q);
		return id[p] == id[q];
	}
	
	public int count() {
		return count;
	}
}
