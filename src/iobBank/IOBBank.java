/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 17/01/20
 *   Time: 12:02 PM
 */

package iobBank;

import rbi.Bank;

public class IOBBank implements Bank {

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
