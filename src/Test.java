import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

	@Test
	public void testStatement() {
		Movie m1 = new Movie("High School Musical", 1);
		Movie m2 = new Movie("Camp Rock", 2);
		Movie m3 = new Movie("Descendants", 3);

		Customer c1 = new Customer("Taylor Swift");

		Rental r1 = new Rental(m1, 6);
		Rental r2 = new Rental(m2, 2);

		c1.addRental(r1);
		c1.addRental(r2);

		assertEquals("Rental Record for Taylor Swift\n"+"\tHigh School Musical\t18.0\n"+"\tCamp Rock\t1.5\n"+ "Amount owed is 19.5\n"+"You earned 3 frequent renter points", c1.statement());
	}


}