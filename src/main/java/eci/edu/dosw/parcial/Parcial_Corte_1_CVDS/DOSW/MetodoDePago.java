package eci.edu.dosw.parcial.Parcial_Corte_1_CVDS.DOSW;

public abstract class MetodoDePago {

    protected boolean valido;
    protected String nombre;
    protected String correo;
    public abstract String getCorreoRegistrado();
    public abstract boolean isValido();
    public abstract String getNombre();
}
