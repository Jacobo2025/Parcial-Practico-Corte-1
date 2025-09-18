package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriptomonedaTest {
    @Test
    public void testCriptomonedaValido(){
        Criptomoneda cm = new Criptomoneda("jacobo", "mañana@gmail.com", true);
        assertEquals("jacobo", cm.getNombre());
        assertEquals("mañana@gmail.com", cm.getCorreoRegistrado());
        assertTrue(cm.isValido());
    }
    @Test
    public void testCriptomonedaInvalido(){
        Criptomoneda cm = new Criptomoneda("jacobo", "mañana@gmail.com", false);
        assertFalse(cm.isValido());
    }

}
