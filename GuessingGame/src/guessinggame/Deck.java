/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import guessinggame.Card;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ac188
 */
public class Deck 
{
    List<Card> deckofCards = new ArrayList<Card>();
    
    public Deck()
    {
        for (int i = 0; i < 4; i ++)
        {
            for (int j = 0; j < 13; j++)
            {
                Card c = new Card(i, j);
                deckofCards.add(c);
            }
        }
    }
    
    public void shuffle()
    {
        Collections.shuffle(deckofCards);
    
    }
    
        
    public void printDeck()
    {
        for (int i = 0; i < 52; i ++)
        {
            System.out.println(deckofCards.get(i).toString());
        }
    }

}
