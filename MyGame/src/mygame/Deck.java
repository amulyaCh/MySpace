/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;
 import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ac188
 */
public class Deck{
    List<Card> deckofCards = new ArrayList<Card>(); 
     public Deck(){
         for (int i=0;i<=3;i++){
             for (int j=0;j<=12;j++){
         
         Card c=new Card(i,j);
         deckofCards.add(c);
         }
         
    }
     }
     public void printDeck(){
         for(int k=0;k<=51;k++){
         System.out.println(deckofCards.get(k).toString());
         }
     }
}
