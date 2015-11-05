import static org.junit.Assert.*;
import org.junit.Test;

public class QuickFindTests {

	@Test
	public void quick_find_should_connect_two_points() {
		QuickFind uf = new QuickFind(2);
		
		uf.union(0, 1);
		
		assertTrue(uf.connected(0, 1));
	}
	
	@Test
	public void quick_find_should_connect_three_points() {
		QuickFind uf = new QuickFind(3);
		
		uf.union(0, 2);
		uf.union(1, 2);
		
		assertTrue(uf.connected(0, 1));
		assertTrue(uf.connected(0, 2));
		assertTrue(uf.connected(1, 2));
	}
	
	@Test
	public void quick_find_should_have_one_component() {
		QuickFind uf = new QuickFind(3);
		
		uf.union(0, 2);
		uf.union(1, 2);
		
		assertEquals(1, uf.count());
	}
	
	@Test
	public void quick_find_should_have_two_components() {
		QuickFind uf = new QuickFind(3);
		
		uf.union(0, 2);
		
		assertEquals(2, uf.count());
	}
	
	@Test
	public void quick_find_should_throw_index_out_of_bounds_exception() {
		QuickFind uf = new QuickFind(3);
		
		try {
			uf.union(0, 4);
		} catch(Exception e) {
			assertEquals(IndexOutOfBoundsException.class, e.getClass());
		}
	}
}
