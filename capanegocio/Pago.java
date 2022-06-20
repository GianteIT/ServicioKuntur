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
public class Pago {

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }
    private String tipo;
    private Double monto;
    private String fechaP;

public ArrayList<Trabajadores> estanRealizados = new ArrayList();
public ArrayList<Proovedores> seEnvia = new ArrayList();

public void agregarProovedores(Proovedores proo) {
seEnvia.add(proo);
}
public void agregarTrabajadores(Trabajadores trab){
estanRealizados.add(trab);
}

public String Verificar()
{
return "Metodo no implementado";
}
}
