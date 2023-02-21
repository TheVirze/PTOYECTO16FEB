package modelos;

public class Propietarios {
    String Apellido;
    String Nombre;
    String Telefono;

    public Propietarios(String Apellido, String Nombre, String Telefono) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
