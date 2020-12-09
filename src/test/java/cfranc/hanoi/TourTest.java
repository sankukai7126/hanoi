package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	
	Disque d1 = new Disque(1);
	Disque d3 = new Disque(3);
	
	
	@Test
	/**
	 * Given_When_Then 
	*/
	public void testEmpiler_TourNonVideEtDisquePlusPetitVrai() {
		
		Tour _TourNonVide= new Tour(2);
		_TourNonVide.empiler(d3);
		
		boolean expected = true;
		boolean actual = _TourNonVide.empiler(d1);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testEmpiler_TourNonVideEtDisquePlusGrandFaux() {
				
		Tour _TourNonVide = new Tour(2);
		_TourNonVide.empiler(d1);
		
		boolean expected = false;
		boolean actual = _TourNonVide.empiler(d3);
		
		assertEquals(expected, actual);
		
	}

}
