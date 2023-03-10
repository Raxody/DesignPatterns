package company.creational.singleton;

public class Card {

    private static Card INSTANCE;
    private String cardNumber;

    private Card() {
    }

    // para que solo se cree una instancia
    public synchronized static Card getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Card();
        }
        return INSTANCE;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
