package rbi;

/**
 * This is the ADT (Abstract Data Type) of a Bank.
 * In Java, we declare the ADT with the help of an Interface.
 */
public interface Bank {
    /**
     * This method returns the rate of interest in a savings account for a bank.
     * The value can be different for different banks.
     *
     * @return The rate of interest of savings account in the bank.
     */
    int getRateOfInterest();

    /**
     * This method returns the rate of interest in a fixed deposit account for a bank.
     * The value can be different for different banks.
     *
     * @return The rate of interest of a fixed deposit account in the bank.
     */
    int getFixedDepositInterest();
}
