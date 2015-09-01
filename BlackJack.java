/*Still needed: add dealer
*/

import java.io.*;
import java.util.Random;

class BlackJack {

    public static void main(String args[]) throws IOException {
        Rules rul = new Rules();
        DeckBuilder b = new DeckBuilder();
        PlayingCard[] cards = b.genDeck();
        Deck playingdeck = new Deck(cards);
        playingdeck.shuffle();
        
        Rules.playRound(playingdeck);
    }
}

class Rules { // make this class static? 
    private static int choose(Deck deck, int sc) throws IOException {
        System.out.println("Hit (h) or stay (any other key)?");
        char ch = (char) System.in.read();
        if(ch == 'h') {
            PlayingCard next = deck.draw();
            System.out.println(next.name + " of " + next.suit);
            sc += next.value;
            System.out.println("score = " + sc);
            if(sc > 21) {
                return sc;
            }
            else { return choose(deck, sc); }
        }
        else {
            return sc;
        }
    }
    
    public static void playRound(Deck deck) throws IOException {
        PlayingCard card1 = deck.draw();
        PlayingCard card2 = deck.draw();
        System.out.print(card1.name + " of " + card1.suit + ", ");
        System.out.print(card2.name + " of " + card2.suit);
        int score = card1.value + card2.value;
        System.out.println("score = " + score);
        if(score == 21) {
            System.out.println("Blackjack!");
        }
        else {
            score = choose(deck, score);
            if(score > 21) {
                System.out.println("Bust!"); 
            }
            else if(score == 21) {
                System.out.println("Twenty-one!");
            }
            else {
                System.out.println("Your score: " + score);
            }
        }
        
        System.out.println("Would you like to play again? y for yes and n for no.");
        char choice = (char) System.in.read();
        if(choice == 'y') {
            playRound(deck);
        }
        
        else {
            System.out.println("Good game.");
        }
    }
}

class PlayingCard {
    int value;
    String name;
    String suit;
    char choice;

    PlayingCard(String n, String s) {        
        suit = s;
        name = n;

        switch (name) {
            case "ace":
                value = 1;
                break;
            case "two":
                value = 2;
                break;
            case "three":
                value = 3;
                break;
            case "four":
                value = 4;
                break;
            case "five":
                value = 5;
                break;
            case "six":
                value = 6;
                break;
            case "seven":
                value = 7;
                break;
            case "eight":
                value = 8;
                break;
            case "nine":
                value = 9;
                break;
            case "ten":
                value = 10;
                break;
            case "jack":
                value = 10;
                break;
            case "queen":
                value = 10;
                break;
            case "king":
                value = 10;
                break;
        }
    }

    int peek() {
        return value;
    }

    int flip() throws IOException {
        if (name == "ace") {
            System.out.println("Enter your choice for Ace value: high (h) or low (l):");
            choice = (char) System.in.read();

            switch(choice) {
                case 'h':
                    value = 11;
                    break;
                case 'l':
                    value = 1;
                    break;
            }
        }
        return value; 
    }
}

class Deck {
    private PlayingCard[] d;
    private int putloc, getloc;
    int size;

    Deck(int s) {
        size = s;
        d = new PlayingCard[size];
        putloc = getloc = 0;
    }

    Deck(PlayingCard[] a) {
        size = a.length;
        d = new PlayingCard[size];
        putloc = getloc = 0;

        for(int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    public PlayingCard draw() {
        if(getloc == putloc) {
            getloc = 0;
            shuffle();            
        }

        return d[getloc++];
    }

    void push(PlayingCard p) {
        if(putloc == d.length) {
            //
        }

        d[putloc++] = p;
    }

    public void shuffle() {
        Random r = new Random();
        for(int i = d.length-1; i > 0; i--) {
            int rand = r.nextInt(i);
            PlayingCard temp = d[i];
            d[i] = d[rand];
            d[rand] = temp;
        }
    }
}

class DeckBuilder { // Make this class static too?

    PlayingCard[] genDeck() {
        int index = 0;
        PlayingCard[] deck = new PlayingCard[52];
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] cards = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        String suit, name;
        int value;

        for(int n = 0; n < suits.length; n++) {
            suit = suits[n];

            for(int m = 0; m < cards.length; m++) {
                name = cards[m];
                deck[index++] = new PlayingCard(name, suit);
            }
        }
        return deck;
    }
}