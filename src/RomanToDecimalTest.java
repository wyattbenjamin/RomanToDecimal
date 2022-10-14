import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14) ;
        assertEquals(RomanToDecimal.romanToDecimal("hi mom"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("IVIVIV"), 16) ;
        assertEquals(RomanToDecimal.romanToDecimal("CM"), 900) ;
        assertEquals(RomanToDecimal.romanToDecimal("ILoveNYPizza"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("xcxc"), 200) ;
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1) ;
        assertEquals(RomanToDecimal.romanToDecimal("XCRules"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("IxIX"), 20) ;
        assertEquals(RomanToDecimal.romanToDecimal("IV"), 4) ;
        assertEquals(RomanToDecimal.romanToDecimal("Two households alike in dignity, in fair Verona where we lay our scene"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("CMCM"), 2000) ;


        assertEquals(RomanToDecimal.romanToDecimal("V"), 5) ;
        assertEquals(RomanToDecimal.romanToDecimal("xciv"), 94) ;
        assertEquals(RomanToDecimal.romanToDecimal("C"), 100) ;
        assertEquals(RomanToDecimal.romanToDecimal("DCCCLXXX"), 880) ;
        assertEquals(RomanToDecimal.romanToDecimal("CXXV"), 125) ;
        assertEquals(RomanToDecimal.romanToDecimal("CCXCVII"), 297) ;


        assertNotEquals(RomanToDecimal.romanToDecimal("Pizza"), 100) ;
        assertNotEquals(RomanToDecimal.romanToDecimal("Monkey"), 92309) ;
    }
}
