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

        List<Card> cardArray = new ArrayList<>();
        cardArray.add(usa);
        cardArray.add(france);
        cardArray.add(germany);
        cardArray.add(britain);
        cardArray.add(russia);
        cardArray.add(china);
        cardArray.add(japan);
        cardArray.add(india);
        cardArray.add(brazil);
        cardArray.add(turkey);
        Deck deck1 = new Deck(cardArray);

    }
}