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
        // print the rate of interest of the ICICI Bank Savings Account
        System.out.println("Rate of interest of ICICI Bank is: " + iciciBankMathuraBranch.getRateOfInterest());
        // create an object of the IOB Bank class
        IOBBank iobBankGLABranch = new IOBBank();
        // print the rate of interest of the IOB Bank Savings Account
        System.out.println("Rate of interest of IOB Bank is: " + iobBankGLABranch.getRateOfInterest());
    }
}
