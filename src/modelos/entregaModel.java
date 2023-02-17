
package modelos;

import java.util.ArrayList;

public class entregaModel {
    public ArrayList<Entrega> ListaUsuarios = new ArrayList<Entrega>();
    public void AgregarUsuarios(String codEquipo, String nomPersona, String fecha, String desSolucion){
        
        Entrega entregaUsuarios = new Entrega (codEquipo, nomPersona,  fecha, desSolucion);
        this.ListaUsuarios.add(entregaUsuarios);
        
    }
    
    public ArrayList ListarUsuarios(){
        return ListaUsuarios;
    }
    
}

