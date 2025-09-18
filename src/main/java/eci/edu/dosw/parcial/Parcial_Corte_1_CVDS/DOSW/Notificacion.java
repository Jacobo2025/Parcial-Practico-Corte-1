package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class Notificacion extends Modulo{
    @Override
    public void funcionEspecial(MetodoDePago metodoDePago) {
        System.out.println("Se ha enviado notificación");
    }

    @Override
    public boolean isAccionRealizada() {
        return false;
    }
}
