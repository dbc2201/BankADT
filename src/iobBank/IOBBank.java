/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 17/01/20
 *   Time: 12:02 PM
 */

package iobBank;

import rbi.Bank;

/**
 * This is the definition class of a Bank (ADT). We will declare the body of the methods
 * defined in the ADT here. This class will implement (inherit) the ADT Interface defined
 * earlier.
 */
public class IOBBank implements Bank {

    /**
     * This method returns the rate of interest in a savings account for IOB bank.
     *
     * @return the rate of interest in a savings account for IOB bank i.e 4%
     */
    @Override
    public int getRateOfInterest() {
        // the rate of interest of IOB Bank is 3%
        return 3;
    }

    @Override
    public int getFixedDepositInterest() {
        // the rate of interest of FD is 6%
        return 6;
    }
}
