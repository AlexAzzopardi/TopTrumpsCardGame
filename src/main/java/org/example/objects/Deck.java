package org.example.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.LinkedList;

@AllArgsConstructor
public class Deck {

    @Getter
    private String player;
    private LinkedList<Card> deck;

    public void showCardsInDeck(){
        for (Card card : this.deck) {
            System.out.println(card.getName());
        }
    }

    public void addCardToBackOfDeck(Card card){
        this.deck.addLast(card);
    }

    public Card getCurrentCard(){
        return this.deck.getFirst();
    }

    public void popCurrentCard(){
        this.deck.removeFirst();
    }

    public Deck roundWon(Deck deckLoser){
        this.addCardToBackOfDeck(deckLoser.getCurrentCard());
        this.addCardToBackOfDeck(this.getCurrentCard());
        this.popCurrentCard();
        return this;
    }

    public Deck roundLost(){
        this.popCurrentCard();
        return this;
    }

    public int getDeckSize(){
        return this.deck.size();
    }

    public void printDeckSize(){
        System.out.println(this.getPlayer() + "Deck size - " + this.getDeckSize());
    }

    public String getCurrentCardName() {
        return this.deck.getFirst().getName();
    }

    public void printCurrentCardName() {
        System.out.println(this.getPlayer() + "Name - " + this.getCurrentCardName());
    }

    public int getCurrentCardPopulation() {
        return this.deck.getFirst().getPopulation();
    }

    public void printCurrentCardPopulation() {
        System.out.println(this.getPlayer() + "Population - " + this.getCurrentCardPopulation());
    }

    public int getCurrentCardEconomy() {
        return this.deck.getFirst().getEconomy();
    }

    public void printCurrentCardEconomy() {
        System.out.println(this.getPlayer() + "Economy - " + this.getCurrentCardEconomy());
    }

    public int getCurrentCardMilitary() {
        return this.deck.getFirst().getMilitary();
    }

    public void printCurrentCardMilitary() {
        System.out.println(this.getPlayer() + "Military - " + this.getCurrentCardMilitary());
    }

    public int getCurrentCardResources() {
        return this.deck.getFirst().getResources();
    }

    public void printCurrentCardResources() {
        System.out.println(this.getPlayer() + "Resources - " + this.getCurrentCardResources());
    }

    public int getCurrentCardDanger() {
        return this.deck.getFirst().getDanger();
    }

    public void printCurrentCardDanger() {
        System.out.println(this.getPlayer() + "Danger - " + this.getCurrentCardDanger());
    }

}