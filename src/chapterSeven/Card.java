package chapterSeven;

public class Card {

    final String face;
    final String suits;

    public Card(String face, String suits) {
        this.face = face;
        this.suits = suits;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + face + '\'' +
                ", suits='" + suits + '\'' +
                '}';
    }



}
