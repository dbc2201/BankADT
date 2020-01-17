/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 17/01/20
 *   Time: 11:59 AM
 */

package iciciBank;

import rbi.Bank;

public class ICICIBank implements Bank {
    @Override
    public int getRateOfInterest() {
        return 0;
    }

    @Override
    public int getFixedDepositInterest() {
        return 0;
    }
}
