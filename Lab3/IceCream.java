/**
* @version date (in_CS_251_002 format: 2018 - 09 - 18)
* @author Jesus Vazquez
**/

// Ice Cream

/**
* Here the only thing that we need to feed is the cost of the dessert. The father "Dessert" already has the name information
* The IceCream constructor takes a String for the name and a double for the price.
 */

public class IceCream extends Dessert {
	
	private double cost;		
	
	/**
	 * This takes the name of the ice cream and the cost. It will use this information to return it!
	 * @param name * name of the ice-cream. It gets borrowed from the father-Dessert class.
	 * @param cost *This is the cost of the ice cream
	 */
	public IceCream(String name, double cost) {
		super(name);
		this.cost = cost;
	}
	
	/**
	 * This class will return the price of the ice cream
	 * @return *will return the price of the ice cream
	 */
	public double getPrice() {
		return cost;
	}
	
}