package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public class PayPal extends MetodoDePago{
    public PayPal(String nombre, String correo, boolean valido){
        this.valido = valido;
        this.nombre = nombre;
        this.correo = correo;
    }
    @Override
    public boolean isValido() {
        return valido;
    }

    @Override
    public String getCorreoRegistrado() {
        return correo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
