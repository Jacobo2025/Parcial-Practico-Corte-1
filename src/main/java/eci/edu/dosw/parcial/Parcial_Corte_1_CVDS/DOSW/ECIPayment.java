package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

import java.util.ArrayList;
import java.util.Scanner;

public class ECIPayment {
    ArrayList<Modulo> modulos;

    public ECIPayment(){
        modulos = new ArrayList<>();
    }

    public void identificarMetodoDePago(int caso){
        switch (caso) {
            case 1:
                TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("jacobo", "jacobo@gmail.com", true);
                procesoDePago(tarjetaDeCredito);
                break;
            case 2:
                PayPal payPal = new PayPal("jacobo", "jacobo@gmail.com", true);
                procesoDePago(payPal);
                break;
            case 3:
                Criptomoneda criptomoneda = new Criptomoneda("jacobo", "jacobo@gmail.com", true);
                procesoDePago(criptomoneda);
                break;
        }

    }

    public void procesoDePago(MetodoDePago metodoDePago){
        if (metodoDePago.isValido()){
            Modulo correo = new Correo();
            correo.funcionEspecial(metodoDePago);


            Modulo factura = new Factura();
            factura.funcionEspecial(metodoDePago);

            Modulo notificacion = new Notificacion();
            notificacion.funcionEspecial(metodoDePago);

            modulos.add(correo);
            modulos.add(factura);
            modulos.add(notificacion);
        } else {
            System.out.println("Método de pago no válido.");
        }
    }

}

