import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    private CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard("1111222233334444", "12/23", 234);
    }

    @Test
    public void canGetCardNumber() {
        assertEquals("1111222233334444", creditCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals("12/23", creditCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(234, creditCard.getSecurityNumber());
    }
//    @Test
//    public void canConnect(){
//        assertEquals("connecting to CodeClan network", printer.connect("CodeClan"));
//    }
    @Test public void canScanCard() {
        assertEquals("Payment Successful",
                creditCard.connect("Payment Successful"));
    }
    @Test public void canSpendCard() {
        assertEquals("You have charged money on your credit card",
            creditCard.spend("You have charged money on your credit card"));
    }
}
