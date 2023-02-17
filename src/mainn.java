
import controladores.EntregaController;
import modelos.entregaModel;
import vistas.frmEntrega;
import vistas.frmPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class mainn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal vistaPrincipal = new frmPrincipal();
        frmEntrega vistaEntrega = new frmEntrega(vistaPrincipal, true);
        entregaModel modeloEntrega = new entregaModel();
        
        EntregaController ControladorUsuarios = new EntregaController(vistaPrincipal,
                vistaEntrega, modeloEntrega);
             
         }
    }
   
