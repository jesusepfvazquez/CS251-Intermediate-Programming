/**
* @version date (in_CS_251_002 format: 2018 - 09 - 18)
* @author Jesus Vazquez
**/

// Candy
/**
* The Candy constructor takes a String for the name and doubles for weight in pounds
* and price per pound.
 */

public class Candy extends Dessert {

    private double weight;
    private double pricePerPound;
	
	/**
	 * This method Takes the name of the candy, the weight and the price per pound of the candy. It willuse 
	 * this information to return the identify the candy and the cost depending on how much it costs 
	 * @param name *name of the candy
	 * @param weight *The weight in pounds of the candy
	 * @param pricePerPound * This is the price of the price per pound of the candy
	 */
    public Candy(String name, double weight, double pricePerPound) {
		super(name);
		this.pricePerPound = pricePerPound;
		this.weight = weight;
	}
	
	/**
	 * This takes the information of the weight and the price to calculate the total cost of the candy
	 * @return * multiplies weight times the price per pound of the candy: what you pay
	 */
	public double getPrice() {
		return this.weight * this.pricePerPound;
	}
	
	/**
	 * This just identifies the price per pound
	 * @return * this returns the price per pound of the candy
	 */

	public double getPricePerPound() {
		return pricePerPound;
	}
	/**
	 * This just identifies the weight in pounds of the candy
	 * @return * will return weight in pounds
	 */
	public double getWeightInPounds() {
		return weight;
	}


}
