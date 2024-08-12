package org.example.gameplay;

import org.example.objects.Deck;

import java.util.LinkedList;

public class HumanVsComputerGame {

    static public void Play(Deck deckPlayer, Deck deckComputer) {
        int gameRound = 0;
        while(deckPlayer.getDeckSize() > 0 && deckComputer.getDeckSize() > 0){

            gameRound++;
            System.out.println("\nRound - " + gameRound);

            deckPlayer.printCurrentCardName();
            deckPlayer.printCurrentCardPopulation();
            deckPlayer.printDeckSize();
            //deckPlayer.showCardsInDeck();
            deckComputer.printCurrentCardName();
            deckComputer.printCurrentCardPopulation();
            deckComputer.printDeckSize();
            //deckComputer.showCardsInDeck();

            // Todo: Use other attribute other than population
            // Todo: Make winner of last round go first
            if(deckComputer.getCurrentCardPopulation() > deckPlayer.getCurrentCardPopulation()){
                deckComputer.roundWon(deckPlayer);
                deckPlayer.roundLost();
            } else{
                deckPlayer.roundWon(deckComputer);
                deckComputer.roundLost();
            }

            // If game goes on too long, ends the game
            if(gameRound>=100){
                deckPlayer = new Deck("test", new LinkedList<>());
            }
        }
        // Win condition
        if(deckPlayer.getDeckSize() > 0){
            System.out.println("Player Won");
        } else{
            System.out.println("Computer Won");
        }

    }

}
