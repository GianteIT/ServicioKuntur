/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Trabajadores extends Persona{

    public String getCodigoT() {
        return codigoT;
    }

    public void setCodigoT(String codigoT) {
        this.codigoT = codigoT;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
     private String codigoT;
     private String rol;

public ArrayList<Pago> realiza = new ArrayList();

public void agregarPago(Pago pago){
realiza.add(pago);
}
public String Pagar()
{
return "Metodo no implementado";
}

public String Informar()
{
return "Metodo no implementado";
}
}
