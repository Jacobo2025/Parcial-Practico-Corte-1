package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class Correo extends Modulo{
    @Override
    public void funcionEspecial(MetodoDePago metodoDePago) {
        enviarCorreo(metodoDePago.getCorreoRegistrado());
    }
    public void enviarCorreo(String correo){
        System.out.println("Se ha enviado correo a" + correo);
    }

    @Override
    public boolean isAccionRealizada() {
        return false;
    }
}
