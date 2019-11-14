/**
* @version date (in_CS_251_002 format: 2018 - 09 - 27)
* @author Jesus Epifanio Vazquez
**/

// InsufficientFundsException Class 

/**
 * This class is to serve us as an exeption. We will be conducting a series of withdrawls and this class 
 * will help us when the withdrawal exeeds the account balance. This class extends also extends Exception.
 * If we happen to need this class we will get the amount of money that exceeds the account balance and we will return it.
 * This class will return "You need more money!"
 */

public class InsufficientFundsException extends Exception {

    private double amount;

    /**
     * This constructor will take the shortfall amount and will store it. 
     * It will return the message "You need more money"
     * @param amount : This is the shortfall money amount
     */
    public InsufficientFundsException(double amount) {
        super(("You need more money!"));
        this.amount = amount;
    }

    /**
     * This method gets used to return the amount of shortfall amount of money
     * @return this will return the difference in the amount of money you're withdrawing to 
     *         what you actually have in case you dont have enough
     */
    public double getShortfall(){
        return amount;
    }

}

