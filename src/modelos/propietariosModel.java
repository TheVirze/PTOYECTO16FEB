package modelos;

import java.util.ArrayList;

public class propietariosModel {
    
    public ArrayList<Propietarios> ListaPropietarios = new ArrayList<Propietarios>();
    
    public void AgregarPropietario(String Apellidos, String Nombre, String Telefono)
    { 
        Propietarios NuevoPropietario = new Propietarios(Apellidos,Nombre,Telefono);
    this.ListaPropietarios.add(NuevoPropietario);
    }
    public ArrayList ListarPropietarios ()
    {
        return ListaPropietarios;
    }
}