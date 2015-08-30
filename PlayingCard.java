package JavaCode;

class PlayingCard {
    private int value;
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
                value = 11;
                break;
            case "queen":
                value = 12;
                break;
            case "king":
                value = 13;
                break;
        }
    }

    int flip() throws java.io.IOException {
        if (name == "ace") {
            System.out.println("Enter your choice: high (h) or low (l)?");
            choice = (char) System.in.read();

            switch(choice) {
                case 'h':
                    value = 14;
                    break;
                case 'l':
                    value = 1;
                    break;
            }
        }
        return value; 
    }
}