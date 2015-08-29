class Card {
    int value;
    String name;
    String suit;
    String choice;

    Card(int val, String suit) {
        
        //take 2 args, or just one, either int or overloaded string? if string use a switch, but lots of cases
    }

    int draw() {
        if (value == "Ace") {
            System.out.println("Enter your choice: high or low?");
            ace = System.in.read();
            //switch
        }
    }
}