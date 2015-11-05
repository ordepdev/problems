import static org.junit.Assert.*;
import org.junit.Test;

public class UnionFindTests {

	@Test
	public void union_find_should_connect_two_points() {
		UnionFind uf = new UnionFind(2);
		
		uf.union(0, 1);
		
		assertTrue(uf.connected(0, 1));
	}
	
	@Test
	public void union_find_should_connect_three_points() {
		UnionFind uf = new UnionFind(3);
		
		uf.union(0, 2);
		uf.union(1, 2);
		
		assertTrue(uf.connected(0, 1));
		assertTrue(uf.connected(0, 2));
		assertTrue(uf.connected(1, 2));
	}
	
	@Test
	public void union_find_should_have_one_component() {
		UnionFind uf = new UnionFind(3);
		
		uf.union(0, 2);
		uf.union(1, 2);
		
		assertEquals(1, uf.count());
	}
	
	@Test
	public void union_find_should_have_two_components() {
		UnionFind uf = new UnionFind(3);
		
		uf.union(0, 2);
		
		assertEquals(2, uf.count());
	}
	
	@Test
	public void union_find_should_throw_index_out_of_bounds_exception() {
		UnionFind uf = new UnionFind(3);
		
		try {
			uf.union(0, 4);
		} catch(Exception e) {
			assertEquals(IndexOutOfBoundsException.class, e.getClass());
		}
	}
}
