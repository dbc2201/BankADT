/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 17/01/20
 *   Time: 11:59 AM
 */

package iciciBank;

import rbi.Bank;

/**
 * This is the definition class of a Bank (ADT). We will declare the body of the methods
 * defined in the ADT here. This class will implement (inherit) the ADT Interface defined
 * earlier.
 */
public class ICICIBank implements Bank {
    @Override
    public int getRateOfInterest() {
        // the rate of interest of ICICI Bank is 4%
        return 4;
    }

    @Override
    public int getFixedDepositInterest() {
        // the rate of interest of FD is 8%
        return 8;
    }
}
