package org.example;

import org.example.objects.Card;
import org.example.objects.Deck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Card usa = new Card("USA", 90, 105, 105, 80, 60);
        Card france = new Card("France", 60, 70, 90, 45, 40);
        Card germany = new Card("Germany", 70, 85, 45, 45, 30);
        Card britain = new Card("Britain", 60, 75, 80, 35, 35);
        Card russia = new Card("Russia", 80, 40, 95, 100, 65);
        Card china = new Card("China", 100, 90, 85, 75, 15);
        Card japan = new Card("Japan", 80, 65, 30, 15, 10);
        Card india = new Card("India", 105, 40, 45, 60, 65);
        Card brazil = new Card("Brazil", 85, 45, 35, 95, 100);
        Card turkey = new Card("Turkey", 70, 30, 75, 35, 75);

        List<Card> cardArray1 = new ArrayList<>();
        List<Card> cardArray2 = new ArrayList<>();
        cardArray1.add(usa);
        cardArray1.add(france);
        cardArray1.add(germany);
        cardArray1.add(britain);
        cardArray1.add(russia);
        cardArray2.add(china);
        cardArray2.add(japan);
        cardArray2.add(india);
        cardArray2.add(brazil);
        cardArray2.add(turkey);
        Deck deck1 = new Deck(cardArray1);
        Deck deck2 = new Deck(cardArray2);

    }
}