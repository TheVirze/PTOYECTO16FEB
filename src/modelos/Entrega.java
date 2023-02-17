
package modelos;

public class Entrega {
    
    String codEquipo;
    String nomPersona;
    String fecha;
    String desSolucion;

    public Entrega(String codEquipo, String nomPersona, String fecha, String desSolucion) {
        this.codEquipo = codEquipo;
        this.nomPersona = nomPersona;
        this.fecha = fecha;
        this.desSolucion = desSolucion;
    }

    public String getCodEquipo() {
        return codEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public String getNomPersona() {
        return nomPersona;
    }

    public void setNomPersona(String nomPersona) {
        this.nomPersona = nomPersona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDesSolucion() {
        return desSolucion;
    }

    public void setDesSolucion(String desSolucion) {
        this.desSolucion = desSolucion;
    }
    
    
    
    
    
}
