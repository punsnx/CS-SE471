package GPT;

public class Main {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPlug();
        EuropeanSocket socket = new AmericanToEuropeanAdapter(americanPlug);

        socket.connectWithTwoRoundPins();
    }
}
