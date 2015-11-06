public class WeightedQuickUnion {
	
	private int[] parent;
	private int[] size;
	private int count;
	
	public WeightedQuickUnion(int N) {
		count = N;
		parent = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) { 
			parent[i] = i;
			size[i] = 1;
		}
	}
	
	private void validateIndex(int p) {
		int N = parent.length;
		if (p < 0 || p >= N) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private int root(int p) {
		validateIndex(p);
		while(p != parent[p]) {
			p = parent[parent[p]];
		}
		return p;
	}
	
	public void union(int p, int q) {
		int rootP = root(p);
		int rootQ = root(q);

		if (rootP == rootQ) return;
		
		if (size[rootP] < size[rootQ]) {
			parent[rootP] = rootQ;
			size[rootQ] += size[rootP];
		} else {
			parent[rootQ] = rootP;
			size[rootP] += size[rootQ];
		}
		
		count--;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public int count() {
		return count;
	}
	
}

