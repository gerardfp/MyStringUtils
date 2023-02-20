import org.example.RafaStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RafaStringsTests {


    @Test
    void capitalizeTest(){
        assertEquals(RafaStrings.capitalizar("nestor"), "Nestor");
        assertEquals(RafaStrings.capitalizar("gerard"), "Gerard");
        assertEquals(RafaStrings.capitalizar("0hola"), "0hola");
        assertEquals(RafaStrings.capitalizar("JoseM"), "JoseM");
        assertEquals(RafaStrings.capitalizar(".ose"), ".ose");
        assertEquals(RafaStrings.capitalizar(" ose"), " ose");
        assertEquals(RafaStrings.capitalizar("(...)"), "(...)");
        assertEquals(RafaStrings.capitalizar(""), "");
        assertEquals(RafaStrings.capitalizar(null), "");


    }
}
