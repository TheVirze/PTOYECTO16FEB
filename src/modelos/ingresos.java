
package modelos;


public class ingresos {
    String marca;
    String modelo;
    String Tipo;
    String problema;

    public ingresos(String marca, String modelo, String Tipo, String problema) {
        this.marca = marca;
        this.modelo = modelo;
        this.Tipo = Tipo;
        this.problema = problema;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
    
    
    
}
