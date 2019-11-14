/**
* @version date (in_CS_251_002 format: 2018 - 09 - 18)
* @author Jesus Vazquez
**/

// Cookies

/**
 * A Cookie item has a number and a price per dozen which are used to determine its price. The Cookie constructor takes a String for the name, an int for the number of cookies,
 * and a double for the price per dozen
 */

public class Cookie extends Dessert {

    private int number;
	private double pricePerDozen;
	
	/**
	 * This takes the name of the cookie, the number of cookies, and the price per dozen and uses it to return 
	 * the number of cookies, total amount of money to pay, and the name of the cookie
	 * @param name * name of the cookie, borrowed from father-Dessert
	 * @param number * number of cookies to be bought 
	 * @param pricePerDozen *the price per dozen of the cookies
	 */
	public Cookie(String name, int number, double pricePerDozen) {
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	/**
	 * Number of cookies being purchased. It just returns it.
	 * @return * This will give you a count on the number of cookies being bought 
	 */
	public int getItemCount() {
		return number;
	}

	/**
	 * The price per dozen of cookies. It just returns it
	 * @return * This will give you the price per dozen of the cookies.
	 */
	public double getPricePerDozen() {
		return pricePerDozen;
	}

	/**
	 * The total amount of money to be paid. It just returns it.
	 * @return * This will give you the total amount of money that you need to pay for the cookies you're getting
	 */
	public double getPrice() {
		return ((number/12.0) * pricePerDozen);
	}
}

