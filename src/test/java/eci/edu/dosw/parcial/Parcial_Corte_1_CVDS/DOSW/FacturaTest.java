package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class FacturaTest {
    @Test
    public void AccionNoRealizadaTest(){
        Factura factura = new Factura();
        assertFalse(factura.accionRealizada);
    }
    public void AccionNoRealizadaTest(){
        ECIPayment eciPayment = new ECIPayment();
        eciPayment.identificarMetodoDePago(1);


    }
}
