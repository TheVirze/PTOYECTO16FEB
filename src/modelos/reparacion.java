package modelos;

public class reparacion {
    String codigo;
    String reparacion;
    String tecnico;
    String fecha;

    public reparacion(String codigo, String reparacion, String tecnico, String fecha) {
        this.codigo = codigo;
        this.reparacion = reparacion;
        this.tecnico = tecnico;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
}
