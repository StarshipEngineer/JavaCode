class Card {
    int value;
    String name;
    String suit;
    char choice;

    Card(String n, int v, String s) {
        name = n;
        value = v;
        suit = s;
    }

    int draw() throws jave.io.IOException {
        if (name == "ace") {
            System.out.println("Enter your choice: high or low?");
            choice = (char) System.in.read();

            switch(choice) {
                case "h":
                    value = 14;
                case "l":
                    value = 1;
            }
        }
        else {
            value = 
        }
    }
}