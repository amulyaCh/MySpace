/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author ac188
 */
public class Card {
     private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Card(int cSuit, int cValue)
    {
        suit = cSuit; 
        value = cValue;
    }

    public String toString()
    {
        String cardInfo = cardValue[value] + " of " + cardSuit[suit];

        return cardInfo;
    }
    public String getImage(){
        String cardImg=cardValue[value]+cardSuit[suit];
        return cardImg;
    }
    public int getValue(){
        return value+1;
    }
}
