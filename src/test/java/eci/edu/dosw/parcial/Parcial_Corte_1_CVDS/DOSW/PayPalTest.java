package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PayPalTest {

    @Test
    public void testPaypalValido() {
        PayPal paypal = new PayPal("Jacobo", "jacobo@correo.com",true);

        assertEquals("Jacobo", paypal.getNombre());
        assertEquals("jacobo@correo.com", paypal.getCorreoRegistrado());
        assertTrue(paypal.isValido());
    }

    @Test
    public void testPaypalInvalido() {
        PayPal paypal = new PayPal("Jacobo", "jacobo@correo.com",false);

        assertFalse(paypal.isValido());
    }
}
