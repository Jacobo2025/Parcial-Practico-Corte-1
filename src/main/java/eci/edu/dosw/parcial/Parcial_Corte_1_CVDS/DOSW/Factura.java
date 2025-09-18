package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class Factura extends Modulo{

    public Factura(){
        this.accionRealizada = false;
    }
    @Override
    public void funcionEspecial(MetodoDePago metodoDePago) {
        System.out.println("Datos de facturación: nombre" + metodoDePago.getNombre() +", " + metodoDePago.getCorreoRegistrado());
        this.accionRealizada = true;
    }

    @Override
    public boolean isAccionRealizada() {
        return accionRealizada;
    }
}
