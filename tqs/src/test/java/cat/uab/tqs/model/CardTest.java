package cat.uab.tqs.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


public class CardTest 
{

    @BeforeEach
    void setUp()
    {
        

    }

    @Test
    void testCardCreation()
    {
        Card card = new Card("Hearts", "A");
        assertEquals("Hearts", card.getSuit());
        assertEquals("A", card.getRank());

    }

    @Test
    void testGetCardValue()
    {
        Card card = new Card("Hearts", "10");
        assertEquals(10, card.getCardValue());

    }
    
}
