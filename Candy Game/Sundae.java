/**
* @version date (in_CS_251_002 format: 2018 - 09 - 18)
* @author Jesus Vazquez
**/

// Sundae

/**
* The Sundae constructor takes an IceCream object for the base ice cream and a Dessert
* object for the topping. The name of a Sundae is the name of the IceCream concatenated
* with the String “ topped with ” and the name of the topping. Here we just borrow the iceCream
* and the topping information from the Dessert and IceCream Classes.
 */

public class Sundae extends IceCream {

    /**
     * This method gets the icecream information and the topping (cookir, ice-cream, candy). It takes the iceCream object
     * and the toppic object. From these objects we borrow the getName() and the getPrice(). We use this information to 
     * returns the phrase "IceCream" wopped with "Topping" as well as the price of both of them combined.
     * @param iceCream *this is the ice cream name and price
     * @param topping * this is the topping name and price
     */
    public Sundae(IceCream iceCream, Dessert topping) {
        super(iceCream.getName() + " topped with " + topping.getName(), iceCream.getPrice() + topping.getPrice());
    }

}
