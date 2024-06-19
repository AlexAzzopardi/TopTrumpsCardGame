package org.example.objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Deck {

    private List<Card> deck;

    public void ShowCards() {
        for (Card card : this.deck) {
            System.out.println(card.getName());
        }
    }

}