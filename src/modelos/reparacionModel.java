package modelos;

import java.util.ArrayList;

public class reparacionModel {
    public ArrayList<reparacion> ListaReparacion = new ArrayList<reparacion>();
    
     public void AgregarReparacion (String codigo, String reparacion, String tecnico, String fecha){
         reparacion nuevaReparacion = new reparacion (codigo, reparacion, tecnico, fecha);
         this.ListaReparacion.add(nuevaReparacion);
     }
     
     public ArrayList ListaReparacion() {
        return ListaReparacion;
    }    
}
