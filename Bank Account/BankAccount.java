/**
* @version date (in_CS_251_002 format: 2018 - 09 - 27)
* @author Jesus Epifanio Vazquez
**/

// Bank Account

/**
 * This class will help us retrieve values such as the account ID, the balance on the account, will help us 
 * deposit and withdraw money, and it will also help us notify us if we do not have enough money. This class will
 * be taking in the account ID and returning the account ID. It also provides methods towards depositing 
 * and withdrawing money to the account. It will also return the account balance after every transaction, as well as if 
 * you encounter a problem such as not having enough money on your account.
 */

public class BankAccount {

    private int accountId;
    private double accountBalance;

    /**
     * This constructor takes in the account ID and saves it.
     * @param accountId This is the account ID of the person.
     */
    public BankAccount(int accountId){
        this.accountId = accountId;
    }

    /**
     * This method returns the account ID as an int.
     * @return this refers to the account ID.
     */
    public int getAccountID() {
        return accountId;
    }

    /**
     * This method gets the account balance as a double.
     * @return this method returns the balance.
     */
    public double getAccountBalance(){
        return accountBalance;
    }

    /**
     * This method takes the deposit amount as a double and adds it to the account.
     * @param deposit This is the total amount of money to be deposited. It does not return anything
     */
    public void deposit(double deposit){
        this.accountBalance = this.accountBalance + deposit;
    }

    /**
     * This method help us in the case that we have a shortfall. It will either withdraw the money
     * or direct us to the execption which is reached if you do not have enough money.
     * @param withdraw this is the total amount of money that we are trying to withdraw
     * @throws InsufficientFundsException this exeption is activated when the amount to be withdrawed is bigger than the 
     *                                    account balance.
     */
    public void withdraw(double withdraw) throws InsufficientFundsException {
        if (withdraw > this.accountBalance){
            throw new InsufficientFundsException(withdraw - accountBalance);
            }
        else {
            this.accountBalance = this.accountBalance - withdraw;
        }
    }

}