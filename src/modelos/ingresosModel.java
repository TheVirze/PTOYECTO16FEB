
package modelos;

import java.util.ArrayList;

public class ingresosModel {
    public ArrayList<ingresos> ListaIngresos = new ArrayList<ingresos>(); 
    
    public void AgregarIngresos(String marca, String modelo, String tipo, String problema)
{
 ingresos NuevoIngreso = new ingresos(marca, modelo, tipo, problema);   
 this.ListaIngresos.add(NuevoIngreso);
}   

public ArrayList ListarIngresos()
{
    return ListaIngresos;
}        

}

