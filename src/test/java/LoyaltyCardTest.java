import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class LoyaltyCardTest {
    private LoyaltyCard loyaltyCard;

    @Before
    public void before() {
        loyaltyCard = new LoyaltyCard("123456787890", "Harrid's Stores");
    }



    @Test public void canScanCard() {
        assertEquals("Points Added", loyaltyCard.connect("Points Added"));
    }

}
