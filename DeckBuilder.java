class DeckBuilder {

    private Card[] genDeck() {
        int index = 0;
        Card[] deck = new Card[52]
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] cards = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"}

        for(int n = 0; n < suits.length; n++) {
            String suit = suits[i];
            String name;
            int value;

            for(int m = 1; m < cards.length; m++) {
                name = cards[m];
                deck[index++] = new Card(name, suit);
            }
        }
        return deck;
    }
}