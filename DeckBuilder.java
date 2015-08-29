class DeckBuilder {

    private Card[] genDeck() {
        int index = 0;
        //Card[] deck = new Card[]
        // just have deck constructor that takes an array and adds elements, may be easier until io sorted- do this option to make deck general, have deck and card super or abstract or interface

        String[] suits = {"hearts", "diamonds", "clubs", "spades"};

        for(int n = 0; n < 4; n++) {
            String suit = suits[i];
            String name;

            for(int i = 1; i < 14; i++) {
                switch(i) {
                    case 1:
                        name = "ace"
                        value = i;
                    case 2:
                        name = "two"
                        value = i;
                    case 3:
                        name = "three"
                        value = i;
                    case 4:
                        name = "four"
                        value = i;
                    case 5:
                        name = "five"
                        value = i;
                    case 6:
                        name = "six"
                        value = i;
                    case 7:
                        name = "seven"
                        value = i;
                    case 8:
                        name = "eight"
                        value = i;
                    case 9:
                        name = "nine"
                        value = i;
                    case 10:
                        name = "ten"
                        value = i;
                    case 11:
                        name = "jack"
                        value = i;
                    case 12:
                        name = "queen"
                        value = i;
                    case 13:
                        name = "king"
                        value = i;
                }
                deck[index++] = new Card(name, value, suit);
            }
        }
        return deck;
    }
}