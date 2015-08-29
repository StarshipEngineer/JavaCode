class PlayingCard {
    int value;
    String name;
    String suit;
    char choice;

    PlayingCard(String n, String s) {        
        suit = s;

        switch (n) {
            case "ace":
                name = n;
                value = 1;
            case "two":
                name = n;
                value = 2;
            case "three":
                name = n;
                value = 3;
            case "four":
                name = n;
                value = 4;
            case "five":
                name = n;
                value = 5;
            case "six":
                name = n;
                value = 6;
            case "seven":
                name = n;
                value = 7;
            case "eight":
                name = n;
                value = 8;
            case "nine":
                name = n;
                value = 9;
            case "ten":
                name = n;
                value = 10;
            case "jack":
                name = n;
                value = 11;
            case "queen":
                name = n;
                value = 12;
            case "king":
                name = n;
                value = 13;
        }
    }

    int flip() throws java.io.IOException {
        if (name == "ace") {
            System.out.println("Enter your choice: high or low?");
            choice = (char) System.in.read();

            switch(choice) {
                case 'h':
                    value = 14;
                case 'l':
                    value = 1;
            }
        }
        return value; 
    }
}