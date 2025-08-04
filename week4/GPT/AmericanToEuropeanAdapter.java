package GPT;

public class AmericanToEuropeanAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public AmericanToEuropeanAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void connectWithTwoRoundPins() {
        System.out.println("Adapter converts round pins to flat pins.");
        americanPlug.connectWithTwoFlatPins();
    }
}
