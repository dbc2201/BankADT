/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 17/01/20
 *   Time: 12:03 PM
 */

package main;

import iciciBank.ICICIBank;
import iobBank.IOBBank;

public class Main {
    public static void main(String[] args) {
        // create an object of the ICICI Bank class
        ICICIBank iciciBankMathuraBranch = new ICICIBank();
        System.out.println("Rate of interest of ICICI Bank is: " + iciciBankMathuraBranch.getRateOfInterest());
        IOBBank iobBankGLABranch = new IOBBank();
        System.out.println("Rate of interest of IOB Bank is: " + iobBankGLABranch.getRateOfInterest());
    }
}
