
import vistas.frmPrincipal;
import vistas.frmIngreso;
import vistas.frmPropietarios;
import vistas.frmReparacion;
import modelos.entregaModel;
import modelos.ingresosModel;
import modelos.propietariosModel;
import modelos.reparacionModel;
import controladores.EntregaController;
import controladores.IngresoController;
import controladores.PropietariosController;
import controladores.reparacionController;

public class main {

    public static void main(String[] args) {
     
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmIngreso VistaIngreso = new frmIngreso (VistaPrincipal, true);
        usuariosModel ModeloUsuarios = new usuariosModel();
        
        usuariosController ControladorUsuarios = new usuariosController(VistaPrincipal,
                VistaUsuarios, ModeloUsuarios);        
        
    }
    
}
