/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */

// 991647546
//Joshua Robinson

public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card oneClub = new Card("Clubs",1);
        System.out.println("The suit is " + oneClub.getSuit() + " and the number of cards is " + oneClub.getValue() + ".");
    }
}
