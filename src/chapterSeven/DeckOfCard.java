package chapterSeven;

import java.util.Arrays;

public class DeckOfCard {

    static final int NUMBER_OF_CARDS = 52;
    private Card[] deck;

    DeckOfCard() {
        String[] suits = {"Spades", "Clubs", "Hearts", "Diamond"};
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        deck = new Card[NUMBER_OF_CARDS];

        int counter = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                deck[counter] = new Card(faces[j], suits[i]);
                counter++;
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "DeckOfCard{" +
                "deck=" + Arrays.toString(deck) +
                '}';
    }

}
