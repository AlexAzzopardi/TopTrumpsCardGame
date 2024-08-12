package org.example;

import org.example.gameplay.HumanVsComputerGame;
import org.example.objects.Card;
import org.example.objects.Deck;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Card> allCards = new ArrayList<>();
        allCards.add(new Card("USA", 90, 105, 105, 80, 60));
        allCards.add(new Card("France", 60, 70, 90, 45, 40));
        allCards.add(new Card("Germany", 70, 85, 45, 45, 30));
        allCards.add(new Card("Britain", 60, 75, 80, 35, 35));
        allCards.add(new Card("Russia", 80, 40, 95, 100, 65));
        allCards.add(new Card("China", 100, 90, 85, 75, 15));
        allCards.add(new Card("Japan", 80, 65, 30, 15, 10));
        allCards.add(new Card("India", 105, 40, 45, 60, 65));
        allCards.add(new Card("Brazil", 85, 45, 35, 95, 100));
        allCards.add(new Card("Turkey", 70, 30, 75, 35, 75));

        Collections.shuffle(allCards);
        int deckSize = allCards.size();

        LinkedList<Card> cardLinkedList1 = new LinkedList<>(allCards.subList(0, deckSize/2));
        LinkedList<Card> cardLinkedList2 = new LinkedList<>(allCards.subList(deckSize/2, deckSize));

        Deck deckPlayer = new Deck("  Player: ", cardLinkedList1);
        Deck deckComputer = new Deck("Computer: ", cardLinkedList2);

        HumanVsComputerGame.Play(deckPlayer, deckComputer);
    }
}